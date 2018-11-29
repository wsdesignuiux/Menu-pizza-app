package e.wolfsoft1.menu_pizza_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.MenuListRecycleAdapter;
import model.MenuListModelClass;


public class MenuListAcitivity extends AppCompatActivity {


    private ArrayList<MenuListModelClass> menuListModelClasses;
    private RecyclerView recyclerView;
    private MenuListRecycleAdapter bAdapter;


    private Integer image[] = {R.drawable.pizza,R.drawable.pizzo,
            R.drawable.pizza,R.drawable.pizzo,R.drawable.pizza,R.drawable.pizzo,
            R.drawable.pizza,R.drawable.pizzo,};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list_acitivity);



        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MenuListAcitivity.this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        menuListModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            MenuListModelClass beanClassForRecyclerView_contacts = new MenuListModelClass(image[i]);
            menuListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new MenuListRecycleAdapter(MenuListAcitivity.this,menuListModelClasses);
        recyclerView.setAdapter(bAdapter);
    }
}
