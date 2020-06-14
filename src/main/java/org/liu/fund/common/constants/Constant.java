package org.liu.fund.common.constants;

import java.util.HashMap;
import java.util.Map;

public class Constant {
	public Constant() {

	}

	// 用于是否禁用是否删除等字段的设置y=是，n=否
	public static final String Y = "y";
	public static final String N = "n";

	// 编码格式
	public static final String UTF8 = "UTF-8";

	public static final String EMPTY = "";

	/** 增信方影像资料上传的影像资料属性 */
	public static final String AUG_IMAGE_DATA_ATTR = "ZXFYYZZ";

	/** 代理人授权说明书的影像资料属性 */
	public static final String ATTORNEY_LETTER_ATTR = "ATTORNEYLETTER";

	/** 保理项目投决文件上传的影像资料属性 */
	public static final String FACTOR_PROJECT_IMAGE_DATA_ATTR = "BLXMTJWJ";

	/** 保理项目内部用印文件属性 */
	public static final String FACTOR_PROJECT_INNER_STAMP_ATTR = "BLXMYY01";

	/** 保理项目项目公司用印文件属性 */
	public static final String FACTOR_PROJECT_COMPANY_STAMP_ATTR = "BLXMYY02";

	/** 保理项目供应商用印文件属性 */
	public static final String Factro_project_SUPPLIER_STAMP_ATTR = "BLXMYY03";

	/**
	 * 增信方删除失败标识： 这个增信方为主增信方，有保理项目
	 */
	public static final int AUG_HAS_PROJECT = 2;

	/** 新增,编辑时，名字已存在的标识 */
	public static final int NAME_REPETITION = 3;

	/** 新增,编辑时，编号已存在的标识 */
	public static final int NUMBER_REPETITION = 4;

	/** 新增,编辑时，类型已存在的标识 */
	public static final int TYPE_REPETITION = 5;

	public static final String AUDIT_STATUS_SUCCESS = "03";

	public static final String AFTER_AUDIT_DESCRIPTION_T = "应收账款投后审核驳回";

	/** 标准时间格式 */
	public static final String DATE_TYPE = "yyyy-MM-dd HH:mm:ss";

	/** 征信方审核状态 00: 待审核 */
	public static final String AUDIT_STATUS = "00";

	/** 中登登记完成状态 2-登记 1-未登记 3-中登变更成功 01-登记待投后审核 02-变更待投后审核 03-投后审核拒绝 04-投后审核中*/

	public static final String ZHONGDENG_IN_AUDIT_BEHIND = "04";
	public static final String ZHONGDENG_REJECTION_BEHIND = "03";
	public static final String ZHONGDENG_CHANGE_BEHIND = "02";
	public static final String ZHONGDENG_REGI_BEHIND = "01";
	public static final String ZHONGDENG_REGI_CHANGE = "3";
	public static final String ZHONGDENG_REGI_STATUS = "2";
	public static final String ZHONGDENG_NO_REGI_STATUS = "1";

	/** 合同生成完成状态 */
	public static final String CONTRACT_STATE = "1";

	/** 营业执照的标识 */
	public static final String BUSINESS_LICENSE_TYPE = "A01";

	/** 中登查询审核状态（包括首次） 1=待审核 2=审核中 4=审核通过 5=审核拒绝 */
	public static final String ZHONGDENG_NO_SEARCH_STATUS = "5";
	public static final String ZHONGDENG_SEARCH_STATUS = "4";
	public static final String ZHONGDENG_IN_SEARCH_STATUS = "2";
	public static final String ZHONGDENG_STAY_SEARCH_STATUS = "1";
	public static final String ZHONGDENG_QUERY = "0";// 中登查询中
	public static final String ZHONGDENG_QUERY_ERR = "3";// 中登查询异常

	/** 基础合同类型 */
	public static final String CONTRACT_ENGINEERING = "engineering";// 工程类
	public static final String CONTRACT_PURCHASE = "purchase";// 采购类

	/** 查询所有的状态 */
	public static final String ALL_STATE = "0";

	/** 应收账款的放款状态 */
	public static final String INIT_LOAN_STATE = "0";
	public static final String ALREADY_LOAN_STATE = "3";

	/** 开票归档状态 */
	public static final String INIT_BILLANDFILL = "00";

	/** 应收账款的确认日期和上传回单状态 */
	public static final String UPLOAD_RECEIPT_STATUS_00 = "0";
	public static final String UPLOAD_RECEIPT_STATUS_01 = "1";
	public static final String UPLOAD_RECEIPT_STATUS_02 = "2";

	/* 返回成功的标识 */
	public static final String SUCCESS_FLAG = "0";

	/* 返回失败的标识 */
	public static final String FAIL_FLAG = "1";

	/** 请求编号 ：用于应收账款列表区分 */
	public static final String NO_ZD = "zd"; /* 中登登记 */
	public static final String NO_BG = "bg"; /* 中登登记变更 */
	public static final String NO_EXAMINE = "sh"; /* 应收账款审核 */
	public static final String NO_TWO = "fh"; /* 应收账款符合 */
	public static final String NO_RECECK = "rc"; /* 投后审核 */
	public static final String NO_RECECK_DETAIL = "rcd"; /* 投后审核详情 */
	public static final String NO_ZHONGDENG_AUDIT = "za"; /* 中登登记投后审核 */
	public static final String NO_ZHONGDENG_BG_AUDIT = "bgex"; /* 中登登记投后审核 */
	public static final String NO_ZDQ_ONE = "one"; /* 中登初次查询 */
	public static final String NO_ZDQ_TWO = "two"; /* 中登二次查询 */
	public static final String NO_ZDQ_QB = "qb"; /* 中登查询全部列表 应收账款列表 */
	public static final String NO_ZDQ_VIEW = "view"; /* 应收账款查看列表 */
	public static final String NO_YW = "yw"; /* 应收账款业务审核详情 */

	/** 中登查询完成返回状态 */
	public static final String ZHONGDENG_SUBMISSION = "1";// 任务提交
	public static final String ZHONGDENG_COMPLETE = "2";// 任务完成
	public static final String ZHONGDENG_DOWNLOAD_NO = "3";// 查询中
	public static final String ZHONGDENG_DOWNLOAD_OK = "4";// 查询完成
	public static final String ZHONGDENG_NOT = "0";// 任务未开始
	public static final String ZHONGDENG_ERR = "-1";// 任务异常

	public static final int CONNECT_NUMBER = 10;// 默认的中登任务连接次数

	public static final String ZHONGDENG_KEYWORD_1 = "全部";// 中登关键字1
	public static final String ZHONGDENG_KEYWORD_2 = "转让";// 中登关键字2

	public static final String ZHONGDENG_MANUAL = "manual";// 手工上传PDF
	public static final String ZHONGDENG_AUTOMATIC = "automatic";// 自动上传PDF
	/** 页面显示状态 */

	public static final String ZHONGDENG_DOWNLOAD_STATE_1 = "1";// 未下载
	public static final String ZHONGDENG_DOWNLOAD_STATE_2 = "2";// 下载完成
	public static final String ZHONGDENG_DOWNLOAD_STATE_3 = "3";// 下载失败

	/** 放款审核状态 放款批次详情表和放款批次表共用的状态 */
	public static final String LOAN_ANTIT_STATUS_INIT = "00"; // 等待审核
	public static final String LOAN_ANTIT_STATUS_AUDITING = "01"; // 审核中
	public static final String LOAN_ANTIT_STATUS_SUCCESS = "02"; // 审核通过
	public static final String LOAN_ANTIT_STATUS_FAILL = "03"; // 审核拒绝
	public static final String WAIT_FOR_EOA = "04";// 待发送EOA
	public static final String EOA_ANDITTING = "05";// EOA审核中
	public static final String EOA_PASS = "06";// EOA审核通过
	public static final String EOA_ROLLBACK = "E01";// EOA回退
	public static final String EOA_INVALID = "E02";// EOA作废
	/** 放款审核状态 放款批次表私有的状态 */
	public static final String LOANNING = "09";// 放款中
	public static final String PART_LOANNED = "10";// 部分已放款
	public static final String ALL_LOANNED = "11";// 已全部放款
	/** 放款审核状态 放款批次详情表私有的状态 **/
	public static final String WAIT_FOR_CMSP = "12";// 待发送财务支付
	public static final String PAYING = "13";// 支付中
	public static final String WAIT_COMFIRM_FLOW = "14";// 待业务确认流水
	public static final String WAIT_FINANCE_COMFIRM_FLOW = "15";// 待财务复核流水
	public static final String FINANCE_COMFIRM_PAYED = "16";// 财务已确认实付
	public static final String CMSP_ROLLBACK = "C01";// 财务回退
	public static final String CMSP_INVALID = "C02";// 财务作废
	public static final String WAIT_FOR_FMS = "19";// 待发送FMS制证
	public static final String FMS_DEAL = "21";// 制证中
	public static final String FMS_SUCCESS = "20";// 已制证
	public static final String FMS_BACK = "22";// 制证回退
	public static final String FMS_FAIL = "23";// 制证失败
	/** 中登查询下载本地路径 */
	public static final String ZHONGDENG_LOCAL = "/Users/qiming.luo/Desktop/test/";

	// public static final String ZHONGDENG_LOCAL = "/download/dj";
	/* 项目公司/供应商审核状态/增信方 */
	/* 00-初始化 01-待审核 02-审核中 03-审核通过 04-审核失败 05-无需审核 */
	/* 00-初始化 01-待复核 02-复核中 03-复核通过 04-复核失败 05-无需复核 */
	public static final String INIT_STATUS = "00";
	public static final String TO_BE_CHECK_STATUS = "01";
	public static final String CHENKING_STATUS = "02";
	public static final String PASS_STATUS = "03";
	public static final String FAIL_STATUS = "04";
	public static final String NOCHECK_STATUS = "05";

	/* 审核标示：one-审核 two-复核 */
	public static final String CHECK_FLAG = "one";
	public static final String RECHECK_FLAG = "two";

	/* 项目公司/供应商初审通过的标识： */
	public static final String COMPANY_FIRST_FLAG = "com_first_audit";
	public static final String SUPPLIER_FIRST_FLAG = "sup_first_audit";

	/* 项目公司/供应商审核拒绝 */
	public static final String COMPANY_FIRST_REJECT = "com_first_reject";
	public static final String SUPPLIER_FIRST_REJECT = "sup_first_reject";

	/* 项目公司/供应商复核通过的标识： */
	public static final String COMPANY_FLAG = "com_second_audit";
	public static final String SUPPLIER_FLAG = "sup_second_audit";

	/* 项目公司/供应商复核拒绝 */
	public static final String COMPANY_SECOND_REJECT = "com_second_reject";
	public static final String SUPPLIER_SECOND_REJECT = "sup_second_reject";

	// 项目公司
	public static final String PC_ONE_FLAG = "FLAG_01";
	public static final String P_NAME_FIRST = "项目公司初审数据";
	public static final String P_CODE_FIRST = "projectCompanyFirstCheck";
	public static final String PC_TWO_FLAG = "FLAG_02";
	public static final String P_NAME_SECOND = "项目公司复审数据";
	public static final String P_CODE_SECOND = "projectCompanySecondCheck";
	// 供应商
	public static final String GYS_ONE_FLAG = "FLAG_03";
	public static final String G_NAME_FIRST = "供应商初审数据";
	public static final String G_CODE_FIRST = "supplierFirstCheck";
	public static final String GYS_TWO_FLAG = "FLAG_04";
	public static final String G_NAME_SECOND = "供应商复审数据";
	public static final String G_CODE_SECOND = "supplierSecondCheck";
	// 应收账款
	public static final String YSZK_ONE_FLAG = "FLAG_05";
	public static final String YSZK_TWO_FLAG = "FLAG_06";
	public static final String Y_NAME_FIRST = "应收账款初审数据";
	public static final String Y_CODE_FIRST = "accountFirstCheck";
	public static final String Y_NAME_SECOND = "应收账款复审数据";
	public static final String Y_CODE_SECOND = "accountSecondCheck";
	// 合同审核
	public static final String HT_FLAG = "FLAG_HT";
	public static final String CONTACT_CODE = "contactCheck";
	public static final String CONTACT_NAME = "合同审核审核数据";
	// 回寄资料实物审核
	public static final String HJZL_FLAG = "FLAG_07";
	public static final String RETURN_INFO_CODE = "returnInfoCheck";
	public static final String RETURN_INFO_NAME = "回寄资料实物审核数据";
	// 放款申请审核
	public static final String LOAN_FLAG = "FLAG_08";
	public static final String LOAN_CODE = "loanCheck";
	public static final String LOAN_NAME = "放款申请审核数据";

	// 命中字段
	public static final String HIT_TYPE_FP = "发票";
	public static final String HIT_TYPE_HT_NAME = "基础合同名称";
	public static final String HIT_TYPE_HT_NUM = "基础合同编号";
	public static final String HIT_TYPE_XM_NAME = "项目公司名称";
	public static final String HIT_YES = "1";
	public static final String HIT_NO = "0";
	// 合同生成
	public static final String CONTRACT_FLAG = "FLAG_09";
	public static final String CONTRACT_CODE = "contractCheck";
	public static final String CONTRACT_NAME = "合同生成数据";

	// 获取合同状态
	public static final String CONTRACT_STATUS_FLAG = "FLAG_10";
	public static final String CONTRACT_STATUS_CODE = "contractStatusCheck";
	public static final String CONTRACT_STATUS_NAME = "获取合同状态数据";

	public static final String USEING = "0";
	public static final String FORBIDDEN = "1";
	// 重置的默认密码
	public static final String RESETPASSWORD = "Eigpay2018baoli";
	// 数据导入时，密码的后缀
	public static final String PWD_SUFFIX = "Ab";
	// 管理员账号
	public static final String ADMIN_ACCOUNT = "admin";

	/**
	 * 邮件标题
	 */
	// 项目公司审核
	public static final String PROJECTCOMPANY_CHECK_MAILTITLE = "项目公司审核任务";
	// 项目公司复核
	public static final String PROJECTCOMPANY_RECHECK_MAILTITLE = "项目公司复核任务";
	// 供应商审核
	public static final String SUPPLIER_CHECK_MAILTITLE = "供应商审核任务";
	// 供应商复核
	public static final String SUPPLIER_RECHECK_MAILTITLE = "供应商复核任务";
	// 应收账款审核
	public static final String ACC_CHECK_MAILTITLE = "应收账款审核任务";
	// 应收账款复核
	public static final String ACC_RECHECK_MAILTITLE = "应收账款复核任务";
	// 合同审核
	public static final String CONTACT_CHECK_MAILTITLE = "合同审核任务";
	// 回寄资料实物审核
	public static final String RETURN_CHECK_MAILTITLE = "回寄资料实物审核任务";
	// 中登查询结果审核
	public static final String ZD_CHECK_MAILTITLE = "中登查询结果审核任务";
	// 放款申请审核
	public static final String LOAN_CHECK_MAILTITLE = "放款申请审核任务";

	// 控制开关：true-用户数据查数据库 false-iobs接口
	public static final boolean USER_SWITCH = false;

	/**
	 * 运营统计：操作内容
	 */
	// 项目公司审核-P001
	public static final String OPER_TYPE_PC_CHECK = "P001";
	// 项目公司复核-P002
	public static final String OPER_TYPE_PC_RECHECK = "P002";
	// 项目公司抽检-P003
	public static final String OPER_TYPE_PC_RANDOMCHECK = "P003";

	// 创建人审核(供应商数据-S000)
	public static final String OPER_TYPE_SU_CONFIRM = "S000";
	// 供应商审核-S001
	public static final String OPER_TYPE_SU_CHECK = "S001";
	// 供应商复核-S002
	public static final String OPER_TYPE_SU_RECHECK = "S002";
	// 供应商抽检
	public static final String OPER_TYPE_SU_RANDOMCHECK = "S003";
	// 应收账款审核-Y001
	public static final String OPER_TYPE_ACC_CHECK = "Y001";
	// 应收账款复核-Y002
	public static final String OPER_TYPE_ACC_RECHECK = "Y002";
	// 应收账款投后审核-Y004
	public static final String OPER_TYPE_ACC_THREE = "Y004";
	// 应收账款抽检-Y003
	public static final String OPER_TYPE_ACC_RANDOMCHECK = "Y003";
	// 应收账款首次中登激活审核-JH001
	public static final String OPER_TYPE_ACTIVATION_001 = "JH001";
	// 应收账款审核激活审核-JH002
	public static final String OPER_TYPE_ACTIVATION_002 = "JH002";
	// 应收账款登记前查询审核激活审核-JH003
	public static final String OPER_TYPE_ACTIVATION_003 = "JH003";

	public static final String OPER_TYPE_PHYSICAL_001 = "PM001";

	// 中登首次查询审核-Z001
	public static final String OPER_TYPE_ZD_CHECK = "Z001";
	// 中登查询审核-Z002
	public static final String OPER_TYPE_ZD_RECHECK = "Z002";
	// 中登登记投后审核-Z003
	public static final String OPER_TYPE_ZD_DJ = "Z003";
	// 中登变更投后审核-Z004
	public static final String OPER_TYPE_ZD_BG = "Z004";
	// 中登登记-Z005
	public static final String OPER_TYPE_ZD_RS = "Z005";
	// 中登变更-Z006
	public static final String OPER_TYPE_ZD_RC = "Z006";

	// 保理项目审核-F001
	public static final String OPER_TYPE_FP_CHECK = "F001";

	// 增信方审核-ZX1
	public static final String OPER_TYPE_ZX_CHECK = "ZX01";

	// 融资管理借款审核
	public static final String OPER_TYPE_RZ_CHECK = "RZ01";
	// 融资管理还款审核
	public static final String OPER_TYPE_RZ_RECHECK = "RZ02";

	// 放款申请审核
	public static final String OPER_TYPE_LR_CHECK = "LR01";

	// 资产出售审核
	public final static String OPER_TYPE_ASSET_SELL_AUDIT = "CS01";

	// ABS资产池出池审核
	public final static String OPER_TYPE_ASSET_OUT_POOL_AUDIT = "ABS01";
	public final static String OPER_TYPE_SYSTEM_AUTO_NEW = "SYSTEM_NEW";
	public final static String OPER_TYPE_SYSTEM_AUTO_EDIT = "SYSTEM_EDIT";
	// 资产收益审核
	public final static String OPER_TYPE_ASSET_INCOME_AUDIT = "INCOME01";
	// 实物上传-应收账款材料保存/暂存
	public final static String OPER_TYPE_ASSET_OUT_ZB_SW_UP = "ZB_SW_UP";
	// 实物上传-应收账款材料审核
	public final static String OPER_TYPE_ASSET_ACCT_SW_UP_AU = "ACCT_SW_UP_AU";

	// 实物上传-项目公司保存/暂存
	public final static String OPER_TYPE_ASSET_OUT_PHY_PCP = "PHY_PCP";
	// 实物上传-项目公司审核
	public final static String OPER_TYPE_ASSET_ACCT_PHY_PCP = "ACCT_PHY_PCP";

	// 实物上传-供应商保存/暂存
	public final static String OPER_TYPE_ASSET_OUT_PHY_SUP = "PHY_SUP";
	// 实物上传-供应商审核
	public final static String OPER_TYPE_ASSET_ACCT_PHY_SUP = "ACCT_PHY_SUP";

	// 实物上传-增信方保存/暂存
	public final static String OPER_TYPE_ASSET_OUT_PHY_AUG = "PHY_AUG";
	// 实物上传-增信方审核
	public final static String OPER_TYPE_ASSET_ACCT_PHY_AUG = "ACCT_PHY_AUG";

	// 审核、复核认领状态
	public static final String CALIM_STATUS_Y = "Y"; // 处理完成
	public static final String CALIM_STATUS_N = "N"; // 处理过程中
	public static final String CALIM_STATUS_C = "C"; // 认领后取消
	public static final String CALIM_STATUS_T = "T"; // 退回到审核
	public static final String CALIM_STATUS_P = "P"; // 初审退回到业务
	public static final String CALIM_STATUS_J = "J"; // 激活业务
	public static final String CALIM_STATUS_F = "F"; // 业务作废
	public static final String CALIM_STATUS_M = "M"; // 审核驳回

	// 认领操作类型
	public static final String CALIM_OPTION_CHECK = "CHECK"; // 检查
	public static final String CALIM_OPTION_SAVE = "SAVE"; // 检查
	public static final String CALIM_OPTION_CANCLE = "CANCLE"; // 取消认领状态

	// 文件上传解压路径
	public static final String FLIE_PATH = "/Users/fact/Desktop/test/";
	// 临时文件保存路径
	public static final String FLIE_TEMP_PATH = "/Users/fact/Desktop/temp/";

	// 实物审核暂存 数据类型（合同/资料）
	public static final String AUDIT_TEMPORARY_TYPE_CONSTRACT = "CONSTRACT"; // 合同审核
	public static final String AUDIT_TEMPORARY_TYPE_MATERIAL = "MATERIAL"; // 材料审核

	// 登陆来源
	public static final String LOGIN_ORIGIN_PC = "pc"; // pc端
	public static final String LOGIN_ORIGIN_APP = "app"; // 移动端

	// 发票审核类型
	public static final String INVO_ZD_ONE = "zdone"; // 中登首次审核
	public static final String INVO_AC_ONE = "acone"; // 应收账款审核
	public static final String INVO_AC_TWO = "actwo"; // 应收账款复核
	public static final String INVO_ZD_TWO = "zdtwo"; // 中登二次审核

	public static final String AUDIT_IN = "no"; // 审核中
	public static final String AUDIT_OK = "ok"; // 审核完成

	public static final String SEAL_INSIDE_SUCCESS = "Seal_Agree"; // 内部印章完成
	public static final String FACTOR_PROJECT_NUM = "FP_NUM"; // 保理项目编号生成字典
	public static final String FACTOR_PROJECT_NUM_YEAR_DICT = "FP_NUM_YEAR_DICT"; // 保理项目编号生成字典

	/**
	 * 资料属性：01-基础资料 02-尽调资料
	 */
	public static final String BASIC_DATA = "01"; // 基础资料
	public static final String DETAILED_DATA = "02"; // 尽调资料
	public static final String FILE_DATA = "03"; // 归档资料-应收账款维度
	public static final String FILE_DATA_FAC = "04"; // 归档资料-保理项目维度
	public static final String FILE_PYBL = "05"; // 平裕保理

	/**
	 * 资料提供方：01-增信方 02-项目公司 03-供应商 05-平域保理 06-外部律师
	 */
	public static final String ZXF_OF_ATTR = "01";
	public static final String XMGS_OF_ATTR = "02";
	public static final String GYS_OF_ATTR = "03";
	public static final String PYBL_OF_ATTR = "05";
	public static final String LAW_OF_ATTR = "06";
	public static String[]  ATTR_MAP = {"01","02","03"};
	public static String[]  ATTR_MAP_COUNT = {"augAccount","projectCompanyAccount","supplierAccount"};

	public static  Map<String,String> ATTR_MAPPER;

	public static  Map<String,String> ATTR_COUNT_MAPPER;

	static {
		ATTR_MAPPER = new HashMap<>();
		ATTR_MAPPER.put("01", "增信方资料：");
		ATTR_MAPPER.put("02", "项目公司资料：");
		ATTR_MAPPER.put("03", "供应商资料：");

		ATTR_COUNT_MAPPER = new HashMap<>();
		ATTR_COUNT_MAPPER.put("01", "augAccount");
		ATTR_COUNT_MAPPER.put("02", "projectCompanyAccount");
		ATTR_COUNT_MAPPER.put("03", "supplierAccount");

	}

	/**
	 * 文档审核目标类型：01-供应商归档；02-项目公司归档；03-增信方归档；04-保理项目归档；05-应收账款归档总状态
	 */
	public static final String DOC_AUDIT_SUPP = "01";
	public static final String DOC_AUDIT_PRO_COM = "02";
	public static final String DOC_AUDIT_MASTER_AUG = "M03";
	public static final String DOC_AUDIT_SLAVE_AUG = "S";// S+
	public static final String DOC_AUDIT_FACTOR_PRO = "04";
	public static final String DOC_AUDIT_ACCT_TOTAL = "05";

	/**
	 * 账号类型:
	 */
	public static final String ACCOUNT_OF_PAN = "pinganAccount"; // 平安内部账号
	public static final String ACCOUNT_OF_PRO = "projectCompanyAccount"; // 项目公司外部账号
	public static final String ACCOUNT_OF_SUP = "supplierAccount"; // 供应商外部账号
	public static final String ACCOUNT_OF_AUG = "augAccount"; // 增信方外部账号
	public static final String ACCOUNT_OF_LAW = "lawyerAccount"; // 外部律师账号
	/**
	 * 账号类型缩写
	 */
	public static final String ACCOUNT_OF_PAN_SHORT = "pinganAccount"; // 平安内部账号
	public static final String ACCOUNT_OF_PRO_SHORT = "XMGS"; // 项目公司外部账号
	public static final String ACCOUNT_OF_SUP_SHORT = "GYS"; // 供应商外部账号
	public static final String ACCOUNT_OF_AUG_SHORT = "ZXF"; // 增信方外部账号
	public static final String ACCOUNT_OF_LAW_SHORT = "WBLS"; // 外部律师账号

	/**
	 * 平台类型: 平台编码&名称
	 */
	public static final String PLAT_OF_CODE = "01"; //
	public static final String PLAT_OF_NAME = "平裕保理"; // 增信方外部账号

	/**
	 * 查询爬虫系统返回状态 3-爬虫失败 ，4 -回调失败
	 */
	public static final String SPIDER_ERR = "3";
	public static final String OUT_ERR = "4";

	/**
	 * 应收账款审核节点控制类型 01-项目公司、02-供应商
	 */
	public static final String SUP = "01";
	public static final String COM = "02";
	public final static String FINANCE_BUS_NUM_PREFIX = "RZJK"; // 融资业务编号前缀
	public final static String FINANCE_BUS_NUM_DESC = "融资业务编号"; // 融资业务编号
	public final static String REPAY_FINANCE_BUS_NUM_PREFIX = "RZHK"; // 融资业务编号前缀
	public final static String REPAY_FINANCE_BUS_NUM_DESC = "融资还款业务编号"; // 融资业务编号

	// 审核类型
	public final static String AUDIT_TYPE = "AUDIT"; // 审核
	public final static String AUDIT_TYPE_APPROPRIATE = "APPROPRIATE"; // 复核

	// 审核状态
	public final static String AUDIT_STASUS_PASS = "PASS"; // 审核通过
	public final static String AUDIT_STASUS_FAIL = "FAIL"; // 审核拒绝

	public static final String REC_PLAN_AUTO_GEN_CODE = "selfRecPlanCheck"; // 自持和委托应收计划生成

	public static final String EOA_AUTO_QUERY_CODE = "eoaQuerying";// eoa自动查询状态
	public static final String EOA_AUTO_QUERY_FLAG = "eoaAuto";// eoa自动查询状态
	public static final String EOA_AUTO_QUERY_NAME = "eoa审批状态查询";// eoa自动查询名称

	public static final String EOA_AUTO_SEND_CODE = "eoaSending";// eoa自动发送状态
	public static final String EOA_AUTO_SEND_FLAG = "eoaSend";// eoa自动发送状态
	public static final String EOA_AUTO_SEND_NAME = "eoa发送状态查询";// eoa自动发送名称

	public static final String CORE_ENT_LOAN_NOTICE_CODE = "coreEntLoanNoticeCode"; //核心企业准入查询状态
	public static final String CORE_ENT_LOAN_NOTICE_FLAG = "coreEntLoanNoticeFlag";
	public static final String CORE_ENT_LOAN_NOTICE_NAME = "核心企业放款通知";

	public static final String CE_ADM_QUERY_CODE = "CEAdmQuerying"; //核心企业准入查询状态
	public static final String CE_ADM_QUERY_FLAG = "CEAdmAuto";
	public static final String CE_ADM_QUERY_NAME = "核心企业准入状态查询";

	public static final String CE_FILE_QUERY_CODE = "CEFileQuerying"; //文件同步查询状态
	public static final String CE_FILE_QUERY_FLAG = "CEFileAuto";
	public static final String CE_FILE_QUERY_NAME = "文件同步状态查询";

	public static final String CE_REC_QUERY_CODE = "CERecQuerying"; //核心企业资产准入查询状态
	public static final String CE_REC_QUERY_FLAG = "CERecAuto";
	public static final String CE_REC_QUERY_NAME = "核心企业资产准入状态查询";

	public static final String CE_MAIL_QUERY_CODE = "CEMailQuerying"; //核心企业资产准入查询状态
	public static final String CE_MAIL_QUERY_FLAG = "CEMailAuto";
	public static final String CE_MAIL_QUERY_NAME = "核心企业资产邮件通知状态查询";

	public static final String YX_MAIL_QUERY_CODE = "YXMailQuerying"; //越秀资产邮件发送查询状态
	public static final String YX_MAIL_QUERY_FLAG = "YXMailAuto";
	public static final String YX_MAIL_QUERY_NAME = "越秀资产邮件通知状态查询";

	public static final String YX_SUPPLIER_QUERY_CODE = "YXSupplierQuerying"; //越秀供应商信息状态
	public static final String YX_SUPPLIER_QUERY_FLAG = "YXSupplierAuto";
	public static final String YX_SUPPLIER_QUERY_NAME = "越秀供应商信息状态查询";

	public static final String YX_RECE_QUERY_CODE = "YXReceQuerying"; //越秀资产信息同步状态
	public static final String YX_RECE_QUERY_FLAG = "YXReceAuto";
	public static final String YX_RECE_QUERY_NAME = "越秀资产信息状态查询";


	public static final String CE_ACC_QUERY_CODE = "CEAccQuerying"; //核心企业账户信息修改查询状态
	public static final String CE_ACC_QUERY_FLAG = "CEAccAuto";
	public static final String CE_ACC_QUERY_NAME = "核心企业账户信息修改状态查询";

	public static final String LF_LOAN_INFO_CODE = "lfLoanInfo";// 自动推送龙湖资金状态
	public static final String LF_LOAN_INFO_FLAG = "lfLoan";// 自动推送龙湖资金状态
	public static final String LF_LOAN_INFO_NAME = "自动推送龙湖资金状态";// 自动推送龙湖资金状态

	public static final String LF_REQUEST_INFO_CODE = "lfRequestData";// 龙湖拉取资产状态
	public static final String LF_REQUEST_INFO_FLAG = "lfRequest";// 龙湖拉取资产状态
	public static final String LF_REQUEST_INFO_NAME = "龙湖拉取资产状态";// 龙湖拉取资产状态

	public static final String REC_AUTO_ORDER_CODE = "recOrderCode";// 自动下发应收代码
	public static final String REC_AUTO_ORDER_FLAG = "recOrderFlag";// 自动下发应收标志
	public static final String REC_AUTO_ORDER_NAME = "自动下发应收指令";// 自动下发应收名称

	public static final String UP_QCC_CODE = "upCode";// 自动更新企查查数据定时任务code
	public static final String UP_QCC_FLAG = "upFlag";// 自动更新企查查数据定时任务标志
	public static final String UP_QCC_NAME = "自动更新企查查数据";//自动更新企查查数据定时任务名称

	public static final String SYNC_TO_ES_CODE = "syncToEsCode";
	public static final String SYNC_TO_ES_FLAG = "syncToEsFlag";
	public static final String SYNC_TO_ES_NAME= "同步数据到ES中";

	public static final String QUERY_BANK_INFO_CODE = "queryBankInfoCode";// 银行基础信息同步定时任务code
	public static final String QUERY_BANK_INFO_FLAG = "queryBankInfoFlag";// 银行基础信息同步定时任务标志
	public static final String QUERY_BANK_INFO_NAME = "银行基础信息同步";// 银行基础信息同步定时任务名称
	// 外部用印查询
	public static final String OUT_STAMP_FLAG = "os";
	public static final String OUT_STAMP_CODE = "outStampQuery";
	public static final String OUT_STAMP_NAME = "外部用印状态查询";

	// E签名宝注册状态/更新状态
	public static final String E_SIGN_NO = "E01"; // 未注册
	public static final String E_SIGN_OK = "E02"; // 注册成功
	public static final String E_SIGN_FAIL = "E03"; // 注册失败

	// 网络有效网域---公网
	public static final String NET_DOMAIN_PUBLIC = "Public";

	// 网络有效网域---隔离区
	public static final String NET_DOMAIN_DMZ = "DMZ";

	// 网络有效网域---内网
	public static final String NET_DOMAIN_SF = "SF";

	public static final String STAMP_CONTRACT_E_FLAG = "01";
	public static final String STAMP_CONTRACT_E_CODE = "stampContractE";
	public static final String STAMP_CONTRACT_E_NAME = "发起合同外部用印";

	public static final String HTTP_USER_SYSTEM = "保理业务系统(System)";

	// 用印方式常量-普通用印
	public static final String STAMP_TYPE_NORMAL = "01";
	// 用印方式常量-电子用印
	public static final String STAMP_TYPE_ESIGN = "02";

	// 获取合同下载地址样式---不需要合同系统的url
	public static final String GET_CON_URL_TYPE_01 = "01";
	// 获取合同下载地址样式---需要合同系统的url
	public static final String GET_CON_URL_TYPE_02 = "02";

	// 账户角色
	public static final String ACC_ROLE_1 = "增信方";
	public static final String ACC_ROLE_2 = "项目公司";
	public static final String ACC_ROLE_3 = "供应商";
	public static final String ACC_ROLE_4 = "增信方盖章经办人";
	public static final String ACC_ROLE_5 = "项目公司盖章经办人";
	public static final String ACC_ROLE_6 = "供应商盖章经办人";
	public static final String ACC_ROLE_7 = "增信方and盖章经办人";
	public static final String ACC_ROLE_8 = "项目公司and盖章经办人";
	public static final String ACC_ROLE_9 = "供应商and盖章经办人";

	public static final String CONTRACT_ISLIMIT_Y = "Y";
	public static final String CONTRACT_ISLIMIT_N = "N";

	/* ocr，金壬查询状态 */
	public static final String OCR_1 = "00";// 成功
	public static final String OCR_2 = "01";// 失败
	public static final String OCR_3 = "02";// 查询中

	// 01=待审核 02=审核中 03=审核通过 04=审核拒绝
	public static final String FACTOR_PROJECT_AUDIT_01 = "01";
	public static final String FACTOR_PROJECT_AUDIT_02 = "02";
	public static final String FACTOR_PROJECT_AUDIT_03 = "03";
	public static final String FACTOR_PROJECT_AUDIT_04 = "04";

	// 02=抽检中 03=抽检通过 04=抽检拒绝
	public static final String RANDOM_CHECK_STATUS_02 = "02";
	public static final String RANDOM_CHECK_STATUS_03 = "03";
	public static final String RANDOM_CHECK_STATUS_04 = "04";

	/* 项目公司涉诉信息审核 */
	public static final String SHESHU = "ss001";

	/**
	 * 发票类型A18的：样例
	 */
	public static final String EXAMPLE_A18 = "/adminStatic/images/example/A18_fapiao.png";

	/**
	 * 发票类型A18的：文件上传格式
	 */
	public static final String ACCEPT_A18 = "image/jpg,image/png,image/jpeg";

	/**
	 * 发票类型A18的：文件的材料说明
	 */
	public static final String DESCRIBE_A18 = "扫描件：请提供全部发票的扫面件；复印件：请提供全部发票的复印件，并在复印件上加盖公章(如多页，需要加盖骑缝章) 、(仅支持图片格式文件，文件名后缀为jpg,png,jpeg)";

	// 暂存状态的类型
	/**
	 * 项目公司暂存状态类型
	 */
	public static final String TEMP_STATUS_COM = "CTT001";

	/**
	 * 供应商暂存状态类型
	 */
	public static final String TEMP_STATUS_SUP = "STT001";
	/**
	 * 应收账款暂存状态类型
	 */
	public static final String TEMP_STATUS_YSZK_SUP = "YTT00101";
	public static final String TEMP_STATUS_YSZK_COM = "YTT00102";

	/* 授权编辑状态 */
	public static final String ACCREDIT = "ac";

	/* 收款日是否确认 */
	public static final String REC_UNCONFIRMED = "00";// 未确认:初始状态
	public static final String REC_CONFIRMATION = "01";// 收款日已确认:收款日确认，上传回单
	/* ABS收款相关状态 业务部分 */
	public static final String WAIT_SEND = "00";// 待发往财务收款:收款初始化状态，只生成收款计划，未下发应收指令
	public static final String ALREADY_SEND = "01";// 收款中:已下发应收指令，并且发送成功
	public static final String WAIR_CONFIRM = "02";// 收款部分确认:根据实收子表金额统计
	public static final String CERTIFICATION = "03";// 收款全部确认:根据实收子表金额统计
	public static final String FINANCE_RETURN = "04";// 财务回退:已下发应收指令，发送失败
	public static final String PARTIAL_CERTIFICATE = "05";// 部分制证:根据实收子表状态统计
	public static final String COMPLETE_CERTIFICATE = "07";// 全部制证:根据实收子表状态统计
	public static final String PROCESS_CERTIFICATE2 = "06";// 制证中:根据实收子表状态统计
	public static final String REC_HAS_SENT = "06";// 已发送应收指令
	public static final String PROCESS_CERTIFICATE3 = "08";// 保理业务状态制证中
	/* ABS收款相关状态 财务部分 */
	// 财务实收状态
	public static final String BINDING_UNCONFIRMED_STATUS = "0";// 未确认
	public static final String BINDING_PARTIAL_STATUS = "7";// 财务部分确认
	public static final String BINDING_COMPLETELY_STATUS = "2";// 完全确认
	public static final String BINDING_REGRESSES_STATUS = "3";// 回退

	// 自持应收计划生成定时任务
	public static final String SELF_PLAN_FLAG = "01";
	public static final String SELF_PLAN_CODE = "selfPlanGenCheck";
	public static final String SELF_PLAN_NAME = "合同生成数据";
	// 收款类型
	public static final String REC_ZBL = "fimp1001";// 资产卖断收款
	public static final String REC_ABS = "fimp1002";// ABS收益收款
	public static final String REC_XMGSHK = "fimp1003";// 项目公司回款
	public static final String REC_DSXMGSK = "fimp1004";// 代收项目公司款
	public static final String REC_ZBL_02 = "fimp1005";// 资产出售收款02
	// 银行流水与应收计划绑定状态
	public static final String REC_REVIEW_REGRESSES = "02";// 复核退回，解除绑定用
	public static final String REC_REVIEW_ADOPT = "01";// 复核通过，流水已确认
	public static final String REC_REVIEW_DEFAULT = "00";// 默认为审核中
	/* 实收子表制证状态 */
	public static final String PENDING_CERTIFICATION = "00";// 待发送制证:初始化
	public static final String ISSUED_CERTIFICATE = "01";// 已发送制证
	public static final String SUCCESSFUL_CERTIFICATE = "02";// 制证成功
	public static final String FAILURE_CERTIFICATE = "03";// 制证失败
	public static final String REGRESSES_CERTIFICATE = "04";// 制证回退
	public static final String PROCESS_CERTIFICATE = "05";// 制证中

	// 制证生成下发常量
	public static final String TABLE_TYPE = "fimp_model_factoring";// 业务大类
	public static final String CURRENCY_TYPE = "CNY";// 币种
	public static final String DATA_SOURCE = "fimp"; // 系统id
	// 类型四下付款
	public static final String INVEST_TYPE_FOUR = "fimp_01"; // 一级分类，类型四
	public static final String BUS_THIN_TYPE_PAY = "PAY_001"; // 一级分类下 二级分类 付款
	public static final String BUS_THIN_TYPE_REC_ASSET = "REC_001"; // 一级分类下 二级分类 卖断实收
	public static final String BUS_THIN_TYPE_REC_ABS = "REC_002"; // 一级分类下 二级分类 ABS收益   M
	// 类型六下付款
	public static final String INVEST_TYPE_SIX= "fimp_02"; // 一级分类，类型六
	public static final String BUS_THIN_TYPE_PAY_SIX = "PAY_002"; // 一级分类下 二级分类 付款
	public static final String BUS_THIN_TYPE_REC_ASSET_SIX = "REC_003"; // 一级分类下 二级分类 卖断实收
	
	public static final String FMS_VOUCHER_TYPE_PAY = "FMS_VOU_GEN_PAY"; // 凭证消息类型 付款
	public static final String FMS_VOUCHER_TYPE_REC = "FMS_VOU_GEN_REC"; // 凭证消息类型 收款

	/* 单张发票中登查询状态 */
	public static final String INVOICE_ZHONGDENG_N = "N";// 未查询
	public static final String INVOICE_ZHONGDENG_Y = "Y";// 已查询未审核
	public static final String INVOICE_ZHONGDENG_W = "W";// 审核完成

	/* 资源类型 */
	public static final String DATA_BASE_INFO = "0";// 基础资料
	public static final String DATA_STANDARD_INFO = "1"; // 尽调资源
	public static final String DATA_CONTRACT_INFO = "2"; // 合同材料
	public static final String DATA_ZD_INFO = "4"; // 中登材料
	public static final String DICT_CLIENT_TYPE = "clientType";// 数据字典角色类型
	public static final String DEFAULT_COMMA = ",";// 数据字典角色类型

	public static final String PHYSICAL_JD_UP = "_JD"; // 实物上传尽调材料
	public static final String PHYSICAL_CONTRACT_UP = "_HT"; // 实物上传合同材料
	public static final String PHYSICAL_BASE_TYPE = "_BASE"; // 实物上传基础资料
	public static final String PHYSICAL_PY_TYPE = "_PY"; // 实物上传平裕资料

	public static final String  PHYSICAL_COPY_OP= "systemAuto"; // 实物上传人

	public static final String VIEW_SHOW_EDITE = "EDITOR";// 编辑页面
	public static final String VIEW_SHOW_DETAIL = "DETAIL";//详情页面


	public static final String PAGE_FORWARD_FLAG_PERSIST = "Preservation";//跳转控制标识-暂存

	// 外部律师抽检状态
	public static final String LAWYER_REVIEW_STATUS_NO = "01";     // 未抽检
	public static final String LAWYER_REVIEW_STATUS_VIEW = "02";   // 已抽检


	public static final String MESSAGE_TYPE_PAY = "PAY";//应付
	public static final String MESSAGE_TYPE_ACTUAL_PAY = "ACTUAL_PAY";//实付
	public static final String MESSAGE_TYPE_REC = "REC";//应收
	public static final String MESSAGE_TYPE_ACTUAL_REC = "ACTUAL_REC";//实收
	public static final String MESSAGE_TYPE_VOUCHER_GEN = "VOUCHER_GEN";//凭证生成
	public static final String MESSAGE_TYPE_VOUCHER_BACK = "VOUCHER_BACK";//凭证回退
	public static final String MESSAGE_TYPE_INVOICE_GEN = "INVOICE_GEN";//开票生成
	public static final String MESSAGE_TYPE_INVOICE_BACK = "INVOICE_BACK";//开票回退

	public static final String MESSAGE_TYPE_YXZC_MSG = "YX_ZC_MSG";//越秀资产消息

	public static final String FMS_IS_RELATED_PARTY_AUG= "0";//增信方为关联方
	public static final String FMS_IS_RELATED_PARTY_COMPANY= "1";//项目公司为关联方

	public static final String SEAL_BEFORE_MATERIAL = "01"; // 用印前材料
	public static final String SEAL_AFTER_MATERIAL  = "02"; // 用印后材料


	public static String accountRemarkToOrgSource(String remark){
		String orgSource = null;
		switch (remark) {
			case ACCOUNT_OF_PRO:
				orgSource = ACCOUNT_OF_PRO_SHORT;
				break;
			case ACCOUNT_OF_SUP:
				orgSource = ACCOUNT_OF_SUP_SHORT;
				break;
			case ACCOUNT_OF_AUG:
				orgSource = ACCOUNT_OF_AUG_SHORT;
				break;
			case ACCOUNT_OF_LAW:
				orgSource = ACCOUNT_OF_LAW_SHORT;
				break;
			default:
				orgSource =remark;
				break;
		}
		return orgSource;
	}
	public static String accountOrgSourceToRemark(String orgSource){

		String remark = null;
		switch (orgSource) {
			case ACCOUNT_OF_PRO_SHORT:
				remark = ACCOUNT_OF_PRO;
				break;
			case ACCOUNT_OF_SUP_SHORT:
				remark = ACCOUNT_OF_SUP;
				break;
			case ACCOUNT_OF_AUG_SHORT:
				remark = ACCOUNT_OF_AUG;
				break;
			case ACCOUNT_OF_LAW_SHORT:
				remark = ACCOUNT_OF_LAW;
				break;
			default:
				remark =orgSource;
				break;
		}
		return remark;

	}

	public static final String CALLBACK_SUCCESS = "0"; // 用印成功
	public static final String CALLBACK_FAIL  = "1"; // 用印失败

	public static final String DEFAULT_OPERATE_USER = "system";

	//拉取龙湖资产 请求状态
	public static final String LF_CB_REQUEST_SUCCESS = "00";
	public static final String LF_CB_REQUEST_FAIL = "01";
	//企业信息接口 接受状态
	public static final String CE_REQUEST_SUCCESS = "00";
	public static final String CE_REQUEST_FAIL = "01";
	//保理项目区域类型
	public static final String HOST_AREA = "01"; 		// 主办区域
	public static final String COOPERATIVE_AREA = "02"; // 协办区域
	public static final String HOSTING_AREA = "03";		// 承办区域


	//保理核心企业资产信息状态
	public static final String CE_RECEIVABLE_INITIALIZE = "00"; // 初始状态
	public static final String CE_RECEIVABLE_PROCESSING = "01"; // 处理中
	public static final String CE_RECEIVABLE_SUCCESS = "02"; // 处理成功
	public static final String CE_RECEIVABLE_ACCOUNT_DIFF = "03"; // 账户信息不一致，需要另起定时任务处理，对资产来说依然是成功
	public static final String CE_RECEIVABLE_FAIL = "04"; // 处理失败

	// 发往合同系统的（平价/折价）标记
	public static final String CONTRACT_DISCOUNT = "S001"; 	  // 折价
	public static final String CONTRACT_NO_DISCOUNT = "S002"; // 平价

	public static final String YX_FILE_QUERY_CODE = "YXFileQuerying"; //越秀文件同步查询状态
	public static final String YX_FILE_QUERY_FLAG = "YXFileAuto";
	public static final String YX_FILE_QUERY_NAME = "越秀文件同步状态查询";

	public static final String PREFIX_MQ_ZC_NO_DEAL = "0";   // 未处理
	public static final String PREFIX_MQ_ZC_DEAL = "1";      // 已处理
	public static final String PREFIX_MQ_ZC_WAIT_DEAL = "2"; // 待处理



	public static final String YX_LOAN_NOTICE_UNPAID = "0";//越秀放款通知状态未支付
	public static final String YX_LOAN_NOTICE_PAYMENTED = "1";//越秀放款通知状态已支付
}
