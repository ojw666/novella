package sm.dao;

import sm.pojo.NoveUser;

public interface NoveUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_user
     *
     * @mbggenerated
     */
    int insert(NoveUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_user
     *
     * @mbggenerated
     */
    int insertSelective(NoveUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_user
     *
     * @mbggenerated
     */
    NoveUser selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NoveUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(NoveUser record);
}