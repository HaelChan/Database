package pat;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import experi.dao.PatientDao;
import experi.dao.PressureDao;
import experi.entity.Patient;
import experi.entity.Pressure;
//import ui.Login;

import java.awt.Toolkit;
import java.sql.Timestamp;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


public class PatSelfInfo {

	protected Shell shell;
	protected Display display;
	//private Combo sex;
	//private Combo age;
	private Text text_Height;
	private Text text_Weight;
	private Text text_Systolic;
	private Text text_familiarDisease;
	private Text text_historyDisease;
	private Text text_Note;
	private Text text_Diastolic;
	protected String pat_mobile;
	protected String pat_name;
	protected String pat_password;
	private Text text_Age;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PatSelfInfo window = new PatSelfInfo();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public PatSelfInfo() {
		
	}
	
	/*
	public PatSelfInfo(String pat_mobile) {
		this.pat_mobile = pat_mobile;
	}
	*/
	
	public PatSelfInfo(String pat_name, String pat_mobile, String pat_password) {
		this.pat_name = pat_name;
		this.pat_mobile = pat_mobile;
		this.pat_password = pat_password;
	}

	/**
	 * Open the window.
	 */
	public void open() {
		display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		//PatientDao patientDao = new PatientDao();
		//Patient patient = patientDao.findByMobile(pat_mobile);
		
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(800, 600);
		shell.setText("\u5B8C\u5584\u4E2A\u4EBA\u4FE1\u606F");
		
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int x = (screenWidth - 800) / 2;
		int y = (screenHeight - 600) / 2;
		shell.setLocation(x, y);
		
		Label lbl_Sex = new Label(shell, SWT.NONE);
		lbl_Sex.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lbl_Sex.setBounds(246, 25, 90, 24);
		lbl_Sex.setText("\u6027        \u522B");
		
		Combo sex = new Combo(shell, SWT.READ_ONLY);
		sex.setBounds(360, 25, 114, 32);
		sex.add("\u7537");
		sex.add("\u5973");
		
		Label lbl_Age = new Label(shell, SWT.NONE);
		lbl_Age.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.NORMAL));
		lbl_Age.setText("\u5E74        \u9F84");
		lbl_Age.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lbl_Age.setBounds(246, 75, 90, 24);
		
		/*
		Combo age = new Combo(shell, SWT.READ_ONLY);
		age.setBounds(360, 75, 114, 32);
		age.setItems("0-30岁","31-40岁","41-50岁","51-60岁","61-70岁","71-80岁","80岁以上");
		*/
		text_Age = new Text(shell, SWT.BORDER);
		text_Age.setBounds(360, 69, 80, 30);
		
		Label lbl_Height = new Label(shell, SWT.NONE);
		lbl_Height.setText("\u8EAB        \u9AD8");
		lbl_Height.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lbl_Height.setBounds(246, 125, 90, 24);
		
		text_Height = new Text(shell, SWT.BORDER);
		text_Height.setBounds(360, 125, 80, 30);
		
		Label lbl_Weight = new Label(shell, SWT.NONE);
		lbl_Weight.setText("\u4F53        \u91CD");
		lbl_Weight.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lbl_Weight.setBounds(246, 175, 90, 24);
		
		text_Weight = new Text(shell, SWT.BORDER);
		text_Weight.setBounds(360, 175, 80, 30);
		
		Label lbl_BloodPressure = new Label(shell, SWT.NONE);
		lbl_BloodPressure.setText("\u8840        \u538B");
		lbl_BloodPressure.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lbl_BloodPressure.setBounds(246, 225, 90, 24);
		
		text_Systolic = new Text(shell, SWT.BORDER);
		text_Systolic.setBounds(360, 225, 80, 30);
		
		Label lbl_familialDisease = new Label(shell, SWT.NONE);
		lbl_familialDisease.setText("\u5BB6\u65CF\u75C5\u51B5");
		lbl_familialDisease.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lbl_familialDisease.setBounds(246, 275, 90, 24);
		
		text_familiarDisease = new Text(shell, SWT.BORDER);
		text_familiarDisease.setBounds(360, 275, 231, 32);
		
		Label lbl_historyDisease = new Label(shell, SWT.NONE);
		lbl_historyDisease.setText("\u65E2\u5F80\u75C5\u53F2");
		lbl_historyDisease.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lbl_historyDisease.setBounds(246, 325, 90, 24);
		
		text_historyDisease = new Text(shell, SWT.BORDER);
		text_historyDisease.setBounds(360, 325, 231, 32);
		
		Label lbl_remark = new Label(shell, SWT.NONE);
		lbl_remark.setText("\u5907       \u6CE8");
		lbl_remark.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lbl_remark.setBounds(246, 375, 90, 24);
		
		text_Note = new Text(shell, SWT.BORDER);
		text_Note.setBounds(360, 375, 231, 74);
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				PatientDao patientDao = new PatientDao();
				Patient patient = new Patient(null, pat_name, pat_password, pat_mobile, sex.getText(), text_Age.getText(), text_Height.getText(), text_Weight.getText(), text_familiarDisease.getText(), text_historyDisease.getText(), null);
				try {
					patientDao.insertPatient(patient); 	//first insert the patient's information to SQL.However we don't know 
					//Patient patient2 = patientDao.findByMobile(pat_mobile);
					String pat_id = patientDao.findByMobile(pat_mobile).getPat_id();
					PressureDao pressureDao = new PressureDao();
					Timestamp timestamp = new Timestamp(System.currentTimeMillis());
					Pressure pressure = new Pressure(null, pat_id, text_Systolic.getText(), text_Diastolic.getText(), timestamp.toString());
					pressureDao.insertPressure(pressure);
					//Pressure pressure2 = pressureDao.findByTime(timestamp);
					//Patient pat = new Patient(pat_id, pressureDao.findByTime(timestamp).getPressure_id(), null, null, null);
					MessageBox messageBox= new MessageBox(shell);
					messageBox.setMessage("\u6ce8\u518c\u6210\u529f");
					messageBox.open();
					display.close();
					//PatMain.main(null);
					PatMain main = new PatMain(pat_mobile);
					main.open();
				}catch (Exception ex) {
					// TODO: handle exception
					ex.printStackTrace();
				}
			}
		});
		button.setBounds(330, 475, 114, 34);
		button.setText("\u63D0\u4EA4");
		
		Label lblM = new Label(shell, SWT.NONE);
		lblM.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblM.setBounds(451, 131, 43, 24);
		lblM.setText("m");
		
		Label lblKg = new Label(shell, SWT.NONE);
		lblKg.setText("kg");
		lblKg.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblKg.setBounds(451, 181, 43, 24);
		
		text_Diastolic = new Text(shell, SWT.BORDER);
		text_Diastolic.setBounds(563, 225, 80, 30);
		
		Label lblmmhg = new Label(shell, SWT.NONE);
		lblmmhg.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 7, SWT.NORMAL));
		lblmmhg.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblmmhg.setBounds(446, 228, 106, 24);
		lblmmhg.setText("(\u6536\u7F29\u538B)mmHg");
		
		Label lblmmhg_1 = new Label(shell, SWT.NONE);
		lblmmhg_1.setText("(\u8212\u5F20\u538B)mmHg");
		lblmmhg_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 7, SWT.NORMAL));
		lblmmhg_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblmmhg_1.setBounds(650, 225, 106, 24);
		
		

	}
}
