package dto;

public class tb_testmake_cateDTO {
    String test_cate;
    String test_type;
    String test_cate_name;
    String test_type_name;

    public tb_testmake_cateDTO() {

    }

    public tb_testmake_cateDTO(String test_cate, String test_type, String test_cate_name, String test_type_name) {
        super();
        this.test_cate = test_cate;
        this.test_type = test_type;
        this.test_cate_name = test_cate_name;
        this.test_type_name = test_type_name;
    }

    public String getTest_cate() {
        return test_cate;
    }

    public void setTest_cate(String test_cate) {
        this.test_cate = test_cate;
    }

    public String getTest_type() {
        return test_type;
    }

    public void setTest_type(String test_type) {
        this.test_type = test_type;
    }

    public String getTest_cate_name() {
        return test_cate_name;
    }

    public void setTest_cate_name(String test_cate_name) {
        this.test_cate_name = test_cate_name;
    }

    public String getTest_type_name() {
        return test_type_name;
    }

    public void setTest_type_name(String test_type_name) {
        this.test_type_name = test_type_name;
    }
}
