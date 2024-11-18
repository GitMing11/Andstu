package com.example.testfile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 버튼 클릭 이벤트 설정
        findViewById(R.id.btn_inquiry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 문의 사항 페이지로 이동
                startActivity(new Intent(MainActivity.this, InquiryActivity.class));
            }
        });

        findViewById(R.id.btn_faq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // FAQ 페이지로 이동
                startActivity(new Intent(MainActivity.this, FAQActivity.class));
            }
        });

        findViewById(R.id.btn_user_guide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 사용자 가이드 페이지로 이동
                startActivity(new Intent(MainActivity.this, UserGuideActivity.class));
            }
        });
    }
}
