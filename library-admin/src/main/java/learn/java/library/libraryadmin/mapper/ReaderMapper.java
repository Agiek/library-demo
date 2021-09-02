package learn.java.library.libraryadmin.mapper;

import java.util.List;
import learn.java.library.libraryadmin.model.Reader;
import learn.java.library.libraryadmin.model.ReaderExample;
import org.apache.ibatis.annotations.Param;

public interface ReaderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    long countByExample(ReaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int deleteByExample(ReaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int deleteByPrimaryKey(Integer readerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int insert(Reader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int insertSelective(Reader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    List<Reader> selectByExample(ReaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    Reader selectByPrimaryKey(Integer readerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByExampleSelective(@Param("record") Reader record, @Param("example") ReaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByExample(@Param("record") Reader record, @Param("example") ReaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByPrimaryKeySelective(Reader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByPrimaryKey(Reader record);
}