package Controller;

import dao.tb_testlistViewDAO;
import dto.tb_testmake_titleDTO;
import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class testViewController {

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping(value = "/testview")
    public String testViewStart() {
        System.out.println("테스트뷰 시작");


        return "testview";
    }


    @RequestMapping(value = "/listview", method = RequestMethod.POST)
    @ResponseBody
    public JSONArray listview() {

        tb_testlistViewDAO tb_testlistViewDAO = sqlSession.getMapper(tb_testlistViewDAO.class);

        ArrayList<tb_testmake_titleDTO> test1 = tb_testlistViewDAO.select_testmake_title();

        int size = test1.size();
        System.out.println(size);

        // ArrayList -> JSON
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < test1.size(); i++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("test_cate_name", test1.get(i).getTest_cate_name());
            jsonObject.put("test_title", test1.get(i).getTest_title());
            jsonArray.add(jsonObject);
        }

        for (Object arr : jsonArray) {
            System.out.println(arr.toString());
        }


        return jsonArray;
    }
}
