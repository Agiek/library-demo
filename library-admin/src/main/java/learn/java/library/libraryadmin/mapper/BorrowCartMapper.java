package learn.java.library.libraryadmin.mapper;

import java.util.List;
import learn.java.library.libraryadmin.model.BorrowCart;
import learn.java.library.libraryadmin.model.BorrowCartExample;
import org.apache.ibatis.annotations.Param;

public interface BorrowCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    long countByExample(BorrowCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int deleteByExample(BorrowCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int deleteByPrimaryKey(@Param("bookId") Integer bookId, @Param("readerId") Integer readerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int insert(BorrowCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int insertSelective(BorrowCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    List<BorrowCart> selectByExample(BorrowCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    BorrowCart selectByPrimaryKey(@Param("bookId") Integer bookId, @Param("readerId") Integer readerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByExampleSelective(@Param("record") BorrowCart record, @Param("example") BorrowCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByExample(@Param("record") BorrowCart record, @Param("example") BorrowCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByPrimaryKeySelective(BorrowCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_cart
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    int updateByPrimaryKey(BorrowCart record);
}