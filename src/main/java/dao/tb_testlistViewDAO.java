package dao;

import dto.tb_testmake_cateDTO;
import dto.tb_testmake_titleDTO;

import java.util.ArrayList;

public interface tb_testlistViewDAO {
    tb_testmake_cateDTO select_testmake_cate();

    ArrayList<tb_testmake_titleDTO> select_testmake_title();
}

