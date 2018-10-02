package br.com.senaijandira.exemplofragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import br.com.senaijandira.exemplofragment.fragments.Fragment1;
import br.com.senaijandira.exemplofragment.fragments.Fragment2;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    TabLayout tabMenu;
    BottomNavigationView bottom_nav;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instanciando o fragment manager
        fm = getSupportFragmentManager();
        //codigo do tab layout
        tabMenu = findViewById(R.id.tabMenu);
        //implementando o listener e ele esta criando os metodos
        tabMenu.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() ==0){
                    openFragment1( null);
                }

                if(tab.getPosition() == 1){
                    openFragment2(null);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        //FIM DO CODIGO DO TABLAYOUT

        //Codigo Bottom Nav
        bottom_nav = findViewById(R.id.bottom_nav);

       bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               if(item.getItemId() == R.id.menu_frag1){
                   openFragment1(null);
                   return true;
               }
               if(item.getItemId() == R.id.menu_frag2){
                   openFragment2(null);
                   return true;
               }

               return false;

           }
       });

        // Fim Codigo Bottom Nav


    }

    public void openFragment1(View view) {
        //faz a transação da mudança de tela
        FragmentTransaction ft = fm.beginTransaction();
        //configurar o que tiver a ser feito
        ft.replace(R.id.frame_layout, new Fragment1());
        //fazer as configurações
        ft.commit();

    }

    public void openFragment2(View view) {

        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new Fragment2());

        ft.commit();

    }
}
