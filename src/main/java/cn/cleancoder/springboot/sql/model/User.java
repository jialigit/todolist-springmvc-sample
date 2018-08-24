package cn.cleancoder.springboot.sql.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.id
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.name
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.age
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.sex
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.birthday
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    private Date birthday;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.id
     *
     * @return the value of User.id
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.id
     *
     * @param id the value for User.id
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.name
     *
     * @return the value of User.name
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.name
     *
     * @param name the value for User.name
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.age
     *
     * @return the value of User.age
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.age
     *
     * @param age the value for User.age
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.sex
     *
     * @return the value of User.sex
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.sex
     *
     * @param sex the value for User.sex
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.birthday
     *
     * @return the value of User.birthday
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.birthday
     *
     * @param birthday the value for User.birthday
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}