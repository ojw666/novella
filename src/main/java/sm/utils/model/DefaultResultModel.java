package sm.utils.model;

import java.io.Serializable;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import sm.utils.constant.ResponseCode;
import sm.utils.parse.ReadPropertyUtils;

/**
 * �����������װ��
 * Created by YangKang on 17/12/20.
 */
public class DefaultResultModel  implements Serializable {
	
	private static final Properties ERROR_MSG_KEY_VALUE_MAP = ReadPropertyUtils.getInstance().readAllProperties("/config/error_msg.properties");
    /**
     * ����code
     */
    private Integer code;

    /**
     * ��������
     */
    private Object data;

    /**
     * ���ش�����Ϣ
     */
    private String errMsg;

    /**
     * ��ҳ��
     */
    private Integer totalPage;

    /**
     * ����Ŀ
     */
    private Long totalCount;


    private static DefaultResultModel singleton = new DefaultResultModel();

    private DefaultResultModel() {
    }

    public static DefaultResultModel getInstance() {
        return singleton;
    }

    public Integer getCode() {
        return code;
    }


    public void setCode(Integer code) {
        this.code = code;
    }


    public Object getData() {
        return data;
    }


    public void setData(Object data) {
        this.data = data;
    }


    public String getErrMsg() {
        return errMsg;
    }


    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
    public boolean validateNullParam(Object param, String errMsg) {
        if (param == null || !StringUtils.isNotEmpty(param.toString().trim())) {
            this.data = null;
            this.code = ResponseCode.PARAM_ERROR.getCode();
            this.errMsg = errMsg;
            return true;
        }
        return false;
    }
    public DefaultResultModel packageObject(int result, Object data) {
        if (result > 0) {
            return packageSuccessObject(data);
        }
        return packageError(result);
    }
    
    public DefaultResultModel packageError(int errCode, String errMsg) {
        this.code = errCode;
        this.errMsg = errMsg;
        this.data = null;
        return this;
    }
    
    public DefaultResultModel packageError(int errCode) {
        return packageError(errCode, getErrorMsg(errCode));
    } 
    /**
     * 1xx Ϊ�û����״̬
     * 11x Ϊ��ֵ�����״̬
     *
     * @param errorCode
     * @return
     */
    public String getErrorMsg(Integer errorCode) {
        return ERROR_MSG_KEY_VALUE_MAP.getProperty(errorCode.toString());
    }
    /**
     * ��װ��ȷ���ݷ���
     *
     * @param data
     */
    public DefaultResultModel packageSuccessObject(Object data) {
        this.code = ResponseCode.SUCCESS.getCode();
        this.data = data;
        this.errMsg = null;
        return this;
    }
      

    public String toString() {
        return "ResultModels{" +
                "code=" + code +
                ", data=" + data +
                ", errMsg='" + errMsg + '\'' +
                ", totalPage=" + totalPage +
                ", totalCount=" + totalCount +
                '}';
    }
}
