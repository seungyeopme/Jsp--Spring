package jackpot.DTO;
import java.sql.Timestamp;

public class bmDTO {
	
	private int bm_num;			/*����������ȣ*/
	private String bm_title;	/*����*/
	private String bm_content; 	/*����*/
	private int bm_form;		/*��������*/
	private String bm_start;	/*����������*/
	private String bm_end;	/*����������*/
	private Timestamp enrollment;	/*���������*/
	private String reg_notice;		/*��Ͼ˸�*/
	private String cmp_notice;		/*�Ϸ�˸�*/
	private int related_bns; 	/*���þ���*/
	private int  bns_box;			/*����������*/
	private int important;			/*�߿����*/
	private int bm_state;		/*��������*/
	private String bm_state2;		/*��������*/
	private String emp_num;			/*�ۼ���*/
	private String bm_name;			/*�ۼ���*/
	private	String day;
	private Timestamp update_day;	/*���������*/
	
	/*���������(incharge)*/
	private int num;		/*��ȣ*/
	private String inchar_name;		/*��������� �̸�*/
	private String inchar_branch;	/*��������� ����*/
	private String inchar_depart;	/*��������� �μ�*/
	private String inchar_position;	/*��������� ����*/

	/*����������(bm_ref)*/
	private int bmr_num;		/*��ȣ*/
	private String ref_name;		/*�������̸�*/
	private String ref_branch;		/*����������*/
	private String ref_depart;		/*������ �μ�*/
	private String ref_position;		/*������ ����*/
	
	
	/*����������(bns_box)*/
	private int bns_num;		/*����������ȣ*/
	private String box_name;	/*�����������̸�*/
	
	/*����(history)*/
	private int his_num;  /*��ȣ*/
	private String his_process;   /*��ô��*/
	private String his_content; 	/*��������*/
	private Timestamp modify_date;		/*����������*/

	
	/*�������� ����(bm_file)*/
	private int bmf_num; 
	private String org_file;
	private String sys_file;
	
	/*����������(bms_rec)*/
	private int rec_num;
	private String rec_name;  /*�����������̸�*/
	private String rec_branch; /*���������� ����*/
	private String rec_depart;  /*���������� �μ�*/
	private String rec_position;	/*���������� ����*/
	
	/*��������(bm_form)*/
	private int bmfo_num;  
	private String bm_formName; 
	
	/*��������(bm_state)*/
	private int state_num;
	
	 /*�߿䵵 (important)*/
	private int imp_num;
	private String important2;
	

	public Timestamp getUpdate_day() {
		return update_day;
	}
	public void setUpdate_day(Timestamp update_day) {
		this.update_day = update_day;
	}
	public String getBm_state2() {
		return bm_state2;
	}
	public void setBm_state2(String bm_state2) {
		this.bm_state2 = bm_state2;
	}

	public String getBm_name() {
		return bm_name;
	}
	public void setBm_name(String bm_name) {
		this.bm_name = bm_name;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getBm_num() {
		return bm_num;
	}
	public void setBm_num(int bm_num) {
		this.bm_num = bm_num;
	}
	public String getBm_title() {
		return bm_title;
	}
	public void setBm_title(String bm_title) {
		this.bm_title = bm_title;
	}
	public String getBm_content() {
		return bm_content;
	}
	public void setBm_content(String bm_content) {
		this.bm_content = bm_content;
	}
	public int getBm_form() {
		return bm_form;
	}
	public void setBm_form(int bm_form) {
		this.bm_form = bm_form;
	}
	public String getBm_start() {
		return bm_start;
	}
	public void setBm_start(String bm_start) {
		this.bm_start = bm_start;
	}
	public String getBm_end() {
		return bm_end;
	}
	public void setBm_end(String bm_end) {
		this.bm_end = bm_end;
	}
	public Timestamp getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(Timestamp enrollment) {
		this.enrollment = enrollment;
	}
	public String getReg_notice() {
		return reg_notice;
	}
	public void setReg_notice(String reg_notice) {
		this.reg_notice = reg_notice;
	}
	public String getCmp_notice() {
		return cmp_notice;
	}
	public void setCmp_notice(String cmp_notice) {
		this.cmp_notice = cmp_notice;
	}
	public int getRelated_bns() {
		return related_bns;
	}
	public void setRelated_bns(int related_bns) {
		this.related_bns = related_bns;
	}
	public int getBns_box() {
		return bns_box;
	}
	public void setBns_box(int bns_box) {
		this.bns_box = bns_box;
	}
	public int getImportant() {
		return important;
	}
	public void setImportant(int important) {
		this.important = important;
	}
	public int getBm_state() {
		return bm_state;
	}
	public void setBm_state(int bm_state) {
		this.bm_state = bm_state;
	}
	
	public String getEmp_num(){
		return emp_num;
	}
	
	public void setEmp_num(String emp_num){
		this.emp_num = emp_num;
	}
		
	public int getNum() {
		return num;
	}
	public void setInc_num(int num) {
		this.num = num;
	}
	public String getInchar_name() {
		return inchar_name;
	}
	public void setInchar_name(String inchar_name) {
		this.inchar_name = inchar_name;
	}
	public String getInchar_branch() {
		return inchar_branch;
	}
	public void setInchar_branch(String inchar_branch) {
		this.inchar_branch = inchar_branch;
	}
	public String getInchar_depart() {
		return inchar_depart;
	}
	public void setInchar_depart(String inchar_depart) {
		this.inchar_depart = inchar_depart;
	}
	public String getInchar_position() {
		return inchar_position;
	}
	public void setInchar_position(String inchar_position) {
		this.inchar_position = inchar_position;
	}


	public void setBns_num(int bns_num){
		this.bns_num = bns_num;
	}
	public int getBns_num(){
		return bns_num;
	}
	
	public void setBox_name(String box_name){
		this.box_name = box_name;
	}
	public String getBox_name(){
		return box_name;
	}

	public void setBmf_num(int bmf_num){
		this.bmf_num = bmf_num; 
	}
	public int getBmf_num(){
		return bmf_num;
	}
	
	public void setOrg_file(String org_file){
		this.org_file = org_file;
	}
	public String org_file(){
		return org_file;
	}
	
	public void setSys_file(String sys_file){
		this.sys_file = sys_file;
	}
	public String sys_file(){
		return sys_file;
	}
	
	public void setBmr_num(int bmr_num){
		this.bmr_num = bmr_num;
	}
	public int bmr_num(){
		return bmr_num;
	}
	public void setRef_name(String ref_name){
		this.ref_name = ref_name;
	}
	public String ref_name(){
		return ref_name;
	}
	public void setRef_branch(String ref_branch){
		this.ref_branch =ref_branch;
	}
	public String ref_branch(){
		return ref_branch;
	}
	public void setRef_depart(String ref_depart){
		this.ref_depart = ref_depart;
	}
	public String ref_depart(){
		return ref_depart;
	}
	public void setRef_position(String ref_position){
		this.ref_position = ref_position;
	}
	public String ref_position(){
		return ref_position;
	}
	public int getHis_num() {
		return his_num;
	}
	public void setHis_num(int his_num) {
		this.his_num = his_num;
	}
	public String getHis_process() {
		return his_process;
	}
	public void setHis_process(String his_process) {
		this.his_process = his_process;
	}
	public String getHis_content() {
		return his_content;
	}
	public void setHis_content(String his_content) {
		this.his_content = his_content;
	}
	public Timestamp getModify_date() {
		return modify_date;
	}
	public void setModify_date(Timestamp modify_date) {
		this.modify_date = modify_date;
	}
	public String getOrg_file() {
		return org_file;
	}
	public String getSys_file() {
		return sys_file;
	}
	public int getBmr_num() {
		return bmr_num;
	}
	public String getRef_name() {
		return ref_name;
	}
	public String getRef_branch() {
		return ref_branch;
	}
	public String getRef_depart() {
		return ref_depart;
	}
	public String getRef_position() {
		return ref_position;
	}
	
	public int getRec_num() {
		return rec_num;
	}
	public void setRec_num(int rec_num) {
		this.rec_num = rec_num;
	}
	public String getRec_name() {
		return rec_name;
	}
	public void setRec_name(String rec_name) {
		this.rec_name = rec_name;
	}
	public String getRec_branch() {
		return rec_branch;
	}
	public void setRec_branch(String rec_branch) {
		this.rec_branch = rec_branch;
	}
	public String getRec_depart() {
		return rec_depart;
	}
	public void setRec_depart(String rec_depart) {
		this.rec_depart = rec_depart;
	}
	public String getRec_position() {
		return rec_position;
	}
	public void setRec_position(String rec_position) {
		this.rec_position = rec_position;
	}
	public int getBmfo_num() {
		return bmfo_num;
	}
	public void setBmfo_num(int bmfo_num) {
		this.bmfo_num = bmfo_num;
	}
	public String getBm_formName() {
		return bm_formName;
	}
	public void setBm_formName(String bm_formName) {
		this.bm_formName = bm_formName;
	}

	public void setState_num(int state_num){
		this.state_num = state_num;
	}
	public int getState_num() {
		return state_num;
	}

	public void setImp_num(int imp_num){
		 this.imp_num=imp_num;
	}
	public int getImp_num(){
		return imp_num;
	}
	
	public String getImportant2() {
		return important2;
	}		
	public void setImportant2(String important2) {
		this.important2 = important2;
	}
	 
}
