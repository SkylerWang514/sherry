package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.LettersMapper;
import com.tencent.wxcloudrun.dao.PositionMapper;
import com.tencent.wxcloudrun.model.Letters;
import com.tencent.wxcloudrun.model.Position;
import com.tencent.wxcloudrun.service.ThanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: springboot-wxcloudrun
 * @description:
 * @author: Skyler
 * @create: 2023-03-03 17:49
 **/

@Service("Thanks")
public class ThanksServiceImpl implements ThanksService {
    @Autowired
    LettersMapper lettersMapper;

    @Autowired
    PositionMapper positionMapper;

    @Override
    public String getContentByName(String name){
        Position position = new Position();
        position = positionMapper.getPositionByName(name);
        if (position == null) return "观众";
        return position.getPosition();
    }

    @Override
    public String getLetterByPosition(String position){
        Letters letters = new Letters();
        letters = lettersMapper.getLettersByPosition(position);
        List<String> stringList = new ArrayList<>();
        stringList.add("群舞");
        stringList.add("监制");
        stringList.add("项目统筹");
        stringList.add("舞蹈编导");
        stringList.add("主演");
        stringList.add("撰稿");
        stringList.add("宣传");
        stringList.add("灯光");
        stringList.add("视频");
        stringList.add("观众");
        if (stringList.contains(position)){
            String[] lettersList;
            String split = "&";
            lettersList = lettersMapper.getLettersByPosition(position).getContent().split(split);
            System.out.println(Arrays.toString(lettersList));
            int number = (int) (Math.random() * (lettersList.length));
            return lettersList[number];
        }
        return lettersMapper.getLettersByPosition(position).getContent();
    }
}
