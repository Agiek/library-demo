package learn.java.library.libraryadmin.mapper;

import java.util.List;
import learn.java.library.libraryadmin.model.Librarian;
import learn.java.library.libraryadmin.model.LibrarianExample;
import org.apache.ibatis.annotations.Param;

public interface LibrarianMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    long countByExample(LibrarianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int deleteByExample(LibrarianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int deleteByPrimaryKey(Integer librarianId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int insert(Librarian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int insertSelective(Librarian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    List<Librarian> selectByExample(LibrarianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    Librarian selectByPrimaryKey(Integer librarianId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByExampleSelective(@Param("record") Librarian record, @Param("example") LibrarianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByExample(@Param("record") Librarian record, @Param("example") LibrarianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByPrimaryKeySelective(Librarian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByPrimaryKey(Librarian record);
}