package com.hojihoji.software.listviewsample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewSample2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_sample2);

        ListView lvMenu = findViewById(R.id.lvMenu);
        List<String> menulist = new ArrayList<>();

        menulist.add("から揚げ定食");
        menulist.add("ハンバーグ定食");
        menulist.add("生姜焼き定食");
        menulist.add("ステーキ定食");
        menulist.add("野菜炒め定食");
        menulist.add("とんかつ定食");
        menulist.add("ミンチかつ定食");
        menulist.add("チキンカツ定食");
        menulist.add("コロッケ定食");
        menulist.add("焼き魚定食");
        menulist.add("焼肉定食");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ListViewSample2.this,android.R.layout.simple_list_item_1,menulist);

        lvMenu.setAdapter(adapter);

        lvMenu.setOnItemClickListener(new ListItemClickListener());
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?>parent, View view,int position,long id){
            OrderConfirmDialogFragment dialogFragment = new OrderConfirmDialogFragment();
            dialogFragment.show(getSupportFragmentManager(),"OrderConfirmFragment");
        }
    }
}
