package sm.utils.model;


import java.util.*;

/**
 * Created by YangKang on 2017/9/7.
 */
public class OrderedProperties extends Properties {

    /**
     * ��ΪLinkedHashSet�������ԣ�key�ڵ���put()��ʱ�򣬴�ŵ�����Ҳ������
     */
    private final LinkedHashSet<Object> keys = new LinkedHashSet<>();

    @Override
    public Enumeration<Object> keys() {
        return Collections.enumeration(keys);
    }

    /**
     * ��put��ʱ��ֻ�ǰ�key����Ĵ浽{@link OrderedProperties#keys}
     * ȡֵ��ʱ�򣬸��������keys�����������ȡ������value
     * ��Ȼ���ø����put����,Ҳ����key value ��ֵ�Ի��Ǵ���hashTable��.
     * ֻ�����ڶ��˸���key������{@link OrderedProperties#keys}
     */
    @Override
    public Object put(Object key, Object value) {
        keys.add(key);
        return super.put(key, value);
    }

    /**
     * ��Ϊ��д������������ڣ���ʽһ����ʱ��,���������
     */
    @Override
    public Set<String> stringPropertyNames() {
        Set<String> set = new LinkedHashSet<>();
        for (Object key : this.keys) {
            set.add((String) key);
        }
        return set;
    }

    /**
     * ��Ϊ��д������������ڣ���ʽ������ʱ��,���������
     */
    @Override
    public Set<Object> keySet() {
        return keys;
    }

    /**
     * ��Ϊ��д������������ڣ���ʽ�ģ���ʱ��,���������
     */
    @Override
    public Enumeration<?> propertyNames() {
        return Collections.enumeration(keys);
    }
}
