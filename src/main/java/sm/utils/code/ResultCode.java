package sm.utils.code;
/*
 * ������Ϣ��
 */
public class ResultCode {
	
	public String  totalInf(int i) {
		String value="";
		switch (i) {
		case 0:value="����ʧ��";
		break;
		case 101:value="�ʺŲ�����";
		case 102:value="�������";break;
		case 103:value="�����ʽ����";break;
		case 111:value="��֤�벻��ȷ";break;
		case 112:value="��֤�뷢��Ƶ��,���Ժ�����";break;
		case 113:value="��֤���ѹ���";break;
		case 114:value="���ֻ����ѱ�ע��";break;
		case 115:value="���û�������";break;
		case 116:value="�������";break;
		case 117:value="ԭ�������";break;
		case 118:value="�������󲻴���";break;
		case 119:value="�Ѵ�����ú�������";break;
		case 120:value="�Է��ѳ�Ϊ����";break;
		case 121:value="ԭ�ֻ������˺Ų�ƥ��";break;
		case 122:value="���ֻ����ѱ������˺Ű�,����������ֻ���";break;
		case 123:value="���ֻ�����ע��";break;
		case 124:value="�����붯̬���ݻ����ϴ���̬ͼƬ";break;
		case 126:value="�������ѱ�ɾ��";break;
		case 127:value="��ǰ�û��޷�ɾ��������";break;
		case 128:value="�ö�̬�ѱ�ɾ��";break;
		case 129:value="��ǰ�û��޷�ɾ���ö�̬";break;
		case 131:value="�õ���������";break;
		case 132:value="��ǰ�û���Ȩ���޸Ĵ˵���";break;
		case 135:value="��ǰ�û���Ȩ��ɾ��������";break;
		case 140:value="��ǰ�û�������ǩ��";break;
		case 142:value="��ѡ��ְλ����";break;
		case 150:value="�ļ�������ѹ�����ϴ���ѡ��ְλ����";break;
		case 151:value="��ഴ��3��Ŀ¼";break;
		case 154:value="��Ʒ���۳�,������ɾ��";break;
		case 152:value="�ļ��Ѵ���";break;
		//5x Ϊͨ�ô�����ش���
		case 500:value="����ʧ��";break;
		case 501:value="�ֻ��Ų��Ϸ�";break;
		case 502:value="��������ȷ"; break;
		case 508:value="���ݿ�ip�����˺��������";break;
		//60x Ϊ��Ա��ѯ���
		case 601:value="���ֲ���";break;
		case 602:value="����";break;
		//20 �ɹ�
		case 200:value="������ɹ�";break;
		default :value="��̨����";break;
		}
		return value;
	}
}
