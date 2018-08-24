package cn.cleancoder.springboot.sql.dao;

import cn.cleancoder.springboot.sql.model.Board;
import cn.cleancoder.springboot.sql.model.BoardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    long countByExample(BoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    int deleteByExample(BoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    int insert(Board record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    int insertSelective(Board record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    List<Board> selectByExample(BoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    Board selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    int updateByExampleSelective(@Param("record") Board record, @Param("example") BoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    int updateByExample(@Param("record") Board record, @Param("example") BoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    int updateByPrimaryKeySelective(Board record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_board
     *
     * @mbg.generated Thu Aug 23 23:10:10 CST 2018
     */
    int updateByPrimaryKey(Board record);
}