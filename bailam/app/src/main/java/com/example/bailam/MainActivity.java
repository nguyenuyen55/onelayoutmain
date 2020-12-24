package com.example.bailam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
 GridView gridView,gridView1,gridView2;

 String[] tieude={"Không thể giữ kín trong tim Nhà mời bạn 50% ","Nhà mười combo 4 món giáng sinh xịn sọ 219k","Không thể giữ kín trong tim Nhà mời bạn 50% ","Nhà mười combo 4 món giáng sinh xịn sọ 219k"};
 String[] cuthe={"Điều nhà không thể giữu trong tim..","Nhà mời com bo 4 món giáng sinh xịn sọ chỉ 219k gồm 3 món nước..","Điều nhà không thể giữu trong tim..","Nhà mời com bo 4 món giáng sinh xịn sọ chỉ 219k gồm 3 món nước.."};
int[] hinh={R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         gridView=findViewById(R.id.gridView);
         GridViewAdaper gv=new GridViewAdaper(hinh,tieude,cuthe,this);
         gridView.setAdapter(gv);

        gridView1=findViewById(R.id.gridView1);
        GridViewAdaper gv1=new GridViewAdaper(hinh,tieude,cuthe,this);
        gridView1.setAdapter(gv1);

        gridView2=findViewById(R.id.gridView2);
        GridViewAdaper gv2=new GridViewAdaper(hinh,tieude,cuthe,this);
        gridView2.setAdapter(gv2);



    }
}