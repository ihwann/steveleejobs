package dto;

public class tb_testmake_titleDTO {
    private int test_no;
    private String test_cate_name;
    private String test_title;


    public tb_testmake_titleDTO() {

    }

    public tb_testmake_titleDTO(int test_no, String test_cate_name, String test_title) {
        super();
        this.test_no = test_no;
        this.test_cate_name = test_cate_name;
        this.test_title = test_title;
    }

    public int getTest_no() {
        return test_no;
    }

    public void setTest_no(int test_no) {
        this.test_no = test_no;
    }

    public String getTest_cate_name() {
        return test_cate_name;
    }

    public void setTest_cate_name(String test_cate_name) {
        this.test_cate_name = test_cate_name;
    }

    public String getTest_title() {
        return test_title;
    }

    public void setTest_title(String test_title) {
        this.test_title = test_title;
    }

    @Override
    public String toString() {
        return "tb_testmake_titleDTO{" +
                "test_no=" + test_no +
                ", test_cate_name='" + test_cate_name + '\'' +
                ", test_title='" + test_title + '\'' +
                '}';
    }
}
