package com.qinshou.emojidemo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:Json 解析工具类
 * Created by 禽兽先生
 * Created on 2018/2/9
 */

public class JsonParseUtil {
    public static List<EmojiEntity> parseEmojiList(String json) {
        List<EmojiEntity> emojiEntityList = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray jsonArray = jsonObject.optJSONArray("emoji_list");
            if (jsonArray != null) {
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject1 = jsonArray.optJSONObject(i);
                    if (jsonObject1 != null) {
                        EmojiEntity mEmojiEntity = new EmojiEntity();
                        mEmojiEntity.setName(jsonObject1.optString("name", ""));
                        mEmojiEntity.setUnicode(jsonObject1.optInt("unicode", 0));
                        emojiEntityList.add(mEmojiEntity);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return emojiEntityList;
    }
}
