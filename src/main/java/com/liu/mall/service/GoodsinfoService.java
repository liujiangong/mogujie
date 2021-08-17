package com.liu.mall.service;

import com.liu.mall.mapper.GoodsinfoMapper;
import com.liu.mall.mapper.Mapper;
import com.liu.mall.pojo.Goodsinfo;
import com.liu.mall.pojo.GoodsinfoExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsinfoService {

    @Autowired
    GoodsinfoMapper gm;
    @Autowired
    Mapper m;


    public Object showinfo(Integer pn, HttpSession s) {
        RowBounds row = new RowBounds((pn - 1) * 15 + 1, 15);
        GoodsinfoExample example = new GoodsinfoExample();
        Integer i = gm.countByExample(example);
        int ps = i / 15;
        if (i % 15 != 0) {
            i++;
        }
        List<Map<String, Object>> list = m.showgoosinfo(row);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ps", ps);//最大页码
        map.put("pn", pn);//当前页码
        map.put("goodsinfo", list);

        return map;
    }

    //搜索框提示内容
    public Object search(String keyword) {
        GoodsinfoExample example = new GoodsinfoExample();
        example.createCriteria().andGtkeywordsLike("%" + keyword + "%");

        List<Goodsinfo> list = gm.selectByExample(example);
        if (list.size() > 10) {
            return list.subList(0, 10);
        } else {
            return list;
        }
    }
    //商城页面显示商品
    public Object showkeywordgoods(Integer pn,String gtkeyword) {
        String[] s = gtkeyword.split(" ");

        RowBounds row = new RowBounds((pn - 1) * 15 + 1, 15);
        GoodsinfoExample example = new GoodsinfoExample();
        Integer i = gm.countByExample(example);
        int ps = i / 15;
        if (i % 15 != 0) {
            i++;
        }

        List<Map<String, Object>> l = new ArrayList<Map<String, Object>>();
        String[] s1 = gtkeyword.split(" ");
        for (String ss:s1) {
            List<Map<String, Object>> list = m.mallshowgoosinfo(row, "%"+ss+"%");
            for (Map<String, Object> m:list) {
                l.add(m);
            }

        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ps", ps);//最大页码
        map.put("pn", pn);//当前页码
        map.put("goodsinfo", l);

        return map;
    }
}