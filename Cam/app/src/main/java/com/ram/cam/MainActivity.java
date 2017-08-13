1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
        21
        22
        23
        24
        25
        26
        27
        28
        29
        30
        31
        32
        33
        34
        35
        36
        37
        38
        39
        40
        41
        42
        43
        44
        45
        46
        47
        48
        49
        50
        51
        52
        53
        54
        55
        56
        57
        58
        59
        60
        61
        62
        63
        64
        65
        66
        67
        68
        69
        package com.example.android.intentdemo;

        import android.app.Activity;
        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.net.Uri;
        import android.os.Bundle;
        import android.provider.MediaStore;
        import android.view.View;
        import android.widget.ImageView;

        import java.io.IOException;

public class MainActivity extends Activity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int IMAGE_CAPTURE_REQUEST_CODE = 100;
    public static final int PICK_GALLERY_IMAGE_REQUEST_CODE = 101;
    private ImageView ivCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivCustom = (ImageView) findViewById(R.id.custom_imageview);

    }

    public void capture(View view) {
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (cameraIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(cameraIntent, IMAGE_CAPTURE_REQUEST_CODE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == IMAGE_CAPTURE_REQUEST_CODE && resultCode == RESULT_OK) {
            Bitmap myImage = data.getParcelableExtra("data");

            if (ivCustom != null) {
                ivCustom.setImageBitmap(myImage);
            }
        }

        if (requestCode == PICK_GALLERY_IMAGE_REQUEST_CODE && resultCode == RESULT_OK) {
            Uri uri = data.getData();

            try {
                Bitmap galleryImage = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                if (ivCustom != null) {
                    ivCustom.setImageBitmap(galleryImage);
                    ivCustom.setScaleType(ImageView.ScaleType.CENTER_CROP);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void pickGalleryImage(View view) {
        Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
        galleryIntent.setType("image/*");
        if (galleryIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(galleryIntent, PICK_GALLERY_IMAGE_REQUEST_CODE);
        }
    }
}