package com.qinshou.emojidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvEmoji = (RecyclerView) findViewById(R.id.rv_emoji);
        rvEmoji.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvEmoji.setAdapter(new EmojiAdapter(JsonParseUtil.parseEmojiList(FileUtil.readAssetsFile(this, "EmojiList.json"))));
    }
}
