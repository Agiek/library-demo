package learn.java.library.libraryadmin.model;

import java.io.Serializable;

public class Librarian implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librarian.librarian_id
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    private Integer librarianId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librarian.librarian_name
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    private String librarianName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librarian.state
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librarian.librarian_password
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    private String librarianPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librarian.librarian_id
     *
     * @return the value of librarian.librarian_id
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public Integer getLibrarianId() {
        return librarianId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librarian.librarian_id
     *
     * @param librarianId the value for librarian.librarian_id
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public void setLibrarianId(Integer librarianId) {
        this.librarianId = librarianId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librarian.librarian_name
     *
     * @return the value of librarian.librarian_name
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public String getLibrarianName() {
        return librarianName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librarian.librarian_name
     *
     * @param librarianName the value for librarian.librarian_name
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librarian.state
     *
     * @return the value of librarian.state
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librarian.state
     *
     * @param state the value for librarian.state
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librarian.librarian_password
     *
     * @return the value of librarian.librarian_password
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public String getLibrarianPassword() {
        return librarianPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librarian.librarian_password
     *
     * @param librarianPassword the value for librarian.librarian_password
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public void setLibrarianPassword(String librarianPassword) {
        this.librarianPassword = librarianPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librarian
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", librarianId=").append(librarianId);
        sb.append(", librarianName=").append(librarianName);
        sb.append(", state=").append(state);
        sb.append(", librarianPassword=").append(librarianPassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}