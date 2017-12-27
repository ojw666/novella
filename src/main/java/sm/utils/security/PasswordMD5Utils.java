package sm.utils.security;

import java.util.Random;

/**
 * ����ӽ��ܹ�����
 * Created by YangKang on 2017/7/26.
 */
public class PasswordMD5Utils {

    /**
     * �����㷨
     *
     * @param str ��������
     * @return �����ַ��� 66λ
     */
    public static String encryString(String str) {
        String md5 = EncryptionUtil.MD5String(str);
        int index = new Random().nextInt(10);
        int lastIndex = str.length();

        /**
         * ��������ַ���
         */
        String firstPwdStr = md5.substring(0, index);
        String lastPwdStr = md5.substring(index);

        /**
         * �������ַ���
         */
        String nonceStr = EncryptionUtil.getNonceStr();

        String firstNonceStr = nonceStr.substring(0, lastIndex);
        String lastNonceStr = nonceStr.substring(lastIndex);
        return index + firstPwdStr + lastIndex + firstNonceStr + lastPwdStr + lastNonceStr;
    }


    /**
     * �Ӽ����ַ���������MD5
     *
     * @param str �����ַ���
     * @return �������md5
     */
    public static String decryStringMD5(String str) {
        if (str == null || str.length() != 66) {
            return null;
        }
        String indexStr = str.substring(0, 1);
        int index = Integer.parseInt(indexStr);
        String firstPwdStr = str.substring(1, index + 1);
        String lastIndexStr = str.substring(index + 1, index + 2);
        int lastIndex = Integer.parseInt(lastIndexStr);
        String lastPwdStr = str.substring(lastIndex + index + 2, lastIndex + 34);
        return firstPwdStr + lastPwdStr;
    }
    public static void main(String[] args) {
    	System.out.println(encryString("lovessh"));
    	System.out.println(decryStringMD5("50d6be75e3e3ec5d6d99d9ad6f4e4ed9b8d8b2e9c87d056597810ec229ff658193"));
    	
    }
}
