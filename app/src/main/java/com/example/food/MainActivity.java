package com.example.food;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder builder;
    DatabaseHelper dbHelper;


    EditText editText1, editText2,editText3;
    Button button1;
    String name,email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        builder = new AlertDialog.Builder(this);
        getSupportActionBar().setTitle("Login Form");
        dbHelper = new DatabaseHelper(this);

        button1 = (Button) findViewById(R.id.login);
        editText1 = (EditText) findViewById(R.id.ed1);
        editText2 = (EditText) findViewById(R.id.ed2);
        editText3 = (EditText) findViewById(R.id.ed3);
        //ContentValues values = new ContentValues();
        boolean isInserted = dbHelper.insertData("cottoncandy"," Original recipe yields 48 servings\n" +
                        "Ingredient Checklist\n" +
                        "\n" +
                        "2 ¾ cups Wheat flour, white, all-purpose, enriched, bleached\n" +
                        " \n" +
                        "1 teaspoon Leavening agents, baking soda\n" +
                        " \n" +
                        "½ teaspoon Leavening agents, baking powder, double-acting, sodium aluminum sulfate\n" +
                        " \n" +
                        "1 cup Butter, with salt\n" +
                        " \n" +
                        "1 ½ cups Sugars, granulated\n" +
                        " \n" +
                        "1 Egg, whole, raw, fresh\n" +
                        "  "
                );
        boolean cocktail = dbHelper.insertData("cocktail"," Ingredients\n" +
                "3 cups hibiscus tea (such as Celestial Seasonings Red Zinger) 3 cups ginger ale 6 fresh pineapple spears\n" +
                "Nutritional Information\n" +
                "\n" +
                "How to Make It\n" +
                "Step 1\n" +
                "In a pitcher, mix together the hibiscus tea and ginger ale. Serve over ice in a tall glass with a fresh pineapple spear.");
        boolean mintjuice = dbHelper.insertData("mint juice"," Ingredients\n" +
                "3 cups hibiscus tea (such as Celestial Seasonings Red Zinger) 3 cups ginger ale 6 fresh pineapple spears\n" +
                "Nutritional Information\n" +
                "\n" +
                "How to Make It\n" +
                "Step 1\n" +
                "In a pitcher, mix together the hibiscus tea and ginger ale. Serve over ice in a tall glass with a fresh pineapple spear.");
        boolean  milkshake = dbHelper.insertData("milkshake","Ingredients\n" +
                "3 cups hibiscus tea (such as Celestial Seasonings Red Zinger) 3 cups ginger ale 6 fresh pineapple spears\n" +
                "Nutritional Information\n" +
                "\n" +
                "How to Make It\n" +
                "Step 1\n" +
                "In a pitcher, mix together the hibiscus tea and ginger ale. Serve over ice in a tall glass with a fresh pineapple spear.");
        boolean  cocumberjuice  = dbHelper.insertData("cocumber juice"," Ingredients\n" +
                "3 cups hibiscus tea (such as Celestial Seasonings Red Zinger) 3 cups ginger ale 6 fresh pineapple spears\n" +
                "Nutritional Information\n" +
                "\n" +
                "How to Make It\n" +
                "Step 1\n" +
                "In a pitcher, mix together the hibiscus tea and ginger ale. Serve over ice in a tall glass with a fresh pineapple spear.");
        boolean  lemonjuice = dbHelper.insertData( "lemon juice"," Ingredients\n" +
                "3 cups hibiscus tea (such as Celestial Seasonings Red Zinger) 3 cups ginger ale 6 fresh pineapple spears\n" +
                "Nutritional Information\n" +
                "\n" +
                "How to Make It\n" +
                "Step 1\n" +
                "In a pitcher, mix together the hibiscus tea and ginger ale. Serve over ice in a tall glass with a fresh pineapple spear.");
        boolean   bluecocktail = dbHelper.insertData("blue cocktail"," Ingredients\n" +
                "3 cups hibiscus tea (such as Celestial Seasonings Red Zinger) 3 cups ginger ale 6 fresh pineapple spears\n" +
                "Nutritional Information\n" +
                "\n" +
                "How to Make It\n" +
                "Step 1\n" +
                "In a pitcher, mix together the hibiscus tea and ginger ale. Serve over ice in a tall glass with a fresh pineapple spear.");
        boolean  bananashake = dbHelper.insertData("banana shake"," to make a cotton candy");
        boolean  redcocktail= dbHelper.insertData("red cocktail"," to make a cotton candy");
        boolean a = dbHelper.insertData("Jelly"," in a glass bowl add the jelly powder & premix packet and mix well.\n" +
                "boil the water & take off heat.\n" +
                "add the hot water to the bowl & keep stirring till all the crystals dissolve.\n" +
                "cool the jelly & then chill in the fridge.\n" +
                "serve with custard, chopped fruit (except fresh pineapple) or by itself.");
        boolean b = dbHelper.insertData("Mango jam"," 1 cup Sugars, granulated\n" +
                " \n" +
                "½ cup Butter, with salt\n" +
                " \n" +
                "2 Egg, whole, raw, fresh\n" +
                " \n" +
                "2 teaspoons Vanilla extract\n" +
                " \n" +
                "1 ½ cups Wheat flour, white, all-purpose, enriched, bleached\n" +
                " \n" +
                "1 ¾ teaspoons Leavening agents, baking powder, double-acting, sodium aluminum sulfate\n" +
                " \n" +
                "½ cup Milk, reduced fat, fluid, 2% milkfat, with added vitamin A\n" +
                " Add 1 Ingredient To Shopping List \n" +
                "DirectionsInstructions Checklist\n" +
                " Step 1\n" +
                "Preheat oven to 350 degrees F (175 degrees C). Grease and flour a 9x9 inch pan or line a muffin pan with paper liners.\n");
        boolean c = dbHelper.insertData("Candy"," to make a cotton candy");
        boolean  co  = dbHelper.insertData("cherrydonut"," Original recipe yields 48 servings\n" +
                "Ingredient Checklist\n" +
                "\n" +
                "2 ¾ cups Wheat flour, white, all-purpose, enriched, bleached\n" +
                " \n" +
                "1 teaspoon Leavening agents, baking soda\n" +
                " \n" +
                "½ teaspoon Leavening agents, baking powder, double-acting, sodium aluminum sulfate\n" +
                " \n" +
                "1 cup Butter, with salt\n" +
                " \n" +
                "1 ½ cups Sugars, granulated\n" +
                " \n" +
                "1 Egg, whole, raw, fresh\n" +
                " ");
        boolean  l = dbHelper.insertData("belgianwaffle" ," Original recipe yields 48 servings\n" +
                "Ingredient Checklist\n" +
                "\n" +
                "2 ¾ cups Wheat flour, white, all-purpose, enriched, bleached\n" +
                " \n" +
                "1 teaspoon Leavening agents, baking soda\n" +
                " \n" +
                "½ teaspoon Leavening agents, baking powder, double-acting, sodium aluminum sulfate\n" +
                " \n" +
                "1 cup Butter, with salt\n" +
                " \n" +
                "1 ½ cups Sugars, granulated\n" +
                " \n" +
                "1 Egg, whole, raw, fresh\n" +
                " ");
        boolean  f = dbHelper.insertData("macaron"," Original recipe yields 48 servings\n" +
                "Ingredient Checklist\n" +
                "\n" +
                "2 ¾ cups Wheat flour, white, all-purpose, enriched, bleached\n" +
                " \n" +
                "1 teaspoon Leavening agents, baking soda\n" +
                " \n" +
                "½ teaspoon Leavening agents, baking powder, double-acting, sodium aluminum sulfate\n" +
                " \n" +
                "1 cup Butter, with salt\n" +
                " \n" +
                "1 ½ cups Sugars, granulated\n" +
                " \n" +
                "1 Egg, whole, raw, fresh\n" +
                " ");
        boolean  e = dbHelper.insertData("bananasplit"," 1 cup Sugars, granulated\n" +
                " \n" +
                "½ cup Butter, with salt\n" +
                " \n" +
                "2 Egg, whole, raw, fresh\n" +
                " \n" +
                "2 teaspoons Vanilla extract\n" +
                " \n" +
                "1 ½ cups Wheat flour, white, all-purpose, enriched, bleached\n" +
                " \n" +
                "1 ¾ teaspoons Leavening agents, baking powder, double-acting, sodium aluminum sulfate\n" +
                " \n" +
                "½ cup Milk, reduced fat, fluid, 2% milkfat, with added vitamin A\n" +
                " Add 1 Ingredient To Shopping List \n" +
                "DirectionsInstructions Checklist\n" +
                " Step 1\n" +
                "Preheat oven to 350 degrees F (175 degrees C). Grease and flour a 9x9 inch pan or line a muffin pan with paper liners.\n");
        boolean  d= dbHelper.insertData("apple pie"," 1 cup Sugars, granulated\n" +
                " \n" +
                "½ cup Butter, with salt\n" +
                " \n" +
                "2 Egg, whole, raw, fresh\n" +
                " \n" +
                "2 teaspoons Vanilla extract\n" +
                " \n" +
                "1 ½ cups Wheat flour, white, all-purpose, enriched, bleached\n" +
                " \n" +
                "1 ¾ teaspoons Leavening agents, baking powder, double-acting, sodium aluminum sulfate\n" +
                " \n" +
                "½ cup Milk, reduced fat, fluid, 2% milkfat, with added vitamin A\n" +
                " Add 1 Ingredient To Shopping List \n" +
                "DirectionsInstructions Checklist\n" +
                " Step 1\n" +
                "Preheat oven to 350 degrees F (175 degrees C). Grease and flour a 9x9 inch pan or line a muffin pan with paper liners.\n");
        boolean  z= dbHelper.insertData("apple cack"," to make a cotton candy");
        boolean  x= dbHelper.insertData("pie"," to make a cotton candy");
        boolean  m= dbHelper.insertData("lemon cack"," 1 cup Sugars, granulated\n" +
                " \n" +
                "½ cup Butter, with salt\n" +
                " \n" +
                "2 Egg, whole, raw, fresh\n" +
                " \n" +
                "2 teaspoons Vanilla extract\n" +
                " \n" +
                "1 ½ cups Wheat flour, white, all-purpose, enriched, bleached\n" +
                " \n" +
                "1 ¾ teaspoons Leavening agents, baking powder, double-acting, sodium aluminum sulfate\n" +
                " \n" +
                "½ cup Milk, reduced fat, fluid, 2% milkfat, with added vitamin A\n" +
                " Add 1 Ingredient To Shopping List \n" +
                "DirectionsInstructions Checklist\n" +
                " Step 1\n" +
                "Preheat oven to 350 degrees F (175 degrees C). Grease and flour a 9x9 inch pan or line a muffin pan with paper liners.\n");
        boolean  n= dbHelper.insertData("red charry cack"," 1 cup Sugars, granulated\n" +
                " \n" +
                "½ cup Butter, with salt\n" +
                " \n" +
                "2 Egg, whole, raw, fresh\n" +
                " \n" +
                "2 teaspoons Vanilla extract\n" +
                " \n" +
                "1 ½ cups Wheat flour, white, all-purpose, enriched, bleached\n" +
                " \n" +
                "1 ¾ teaspoons Leavening agents, baking powder, double-acting, sodium aluminum sulfate\n" +
                " \n" +
                "½ cup Milk, reduced fat, fluid, 2% milkfat, with added vitamin A\n" +
                " Add 1 Ingredient To Shopping List \n" +
                "DirectionsInstructions Checklist\n" +
                " Step 1\n" +
                "Preheat oven to 350 degrees F (175 degrees C). Grease and flour a 9x9 inch pan or line a muffin pan with paper liners.\n");
        boolean  p= dbHelper.insertData("choco chack"," INGREDIENTS\n" +
                "1 pint ice cream (such as Breyers Delights Vanilla Cupcake Ice Cream)\n" +
                "1 1/2 tbsp. butter\n" +
                "1 1/4 c. corn cereal, crushed\n" +
                "1/2 tsp. ground cinnamon\n" +
                "2 tsp. granulated sugar\n" +
                "Whipped cream, for garnish\n" +
                "Sprinkles, for garnish\n" +
                "4 maraschino cherries, for garnish\n" +
                "DIRECTIONS\n" +
                "Line a small sheet tray with parchment paper and place in freezer. Scoop ice cream into 4 balls and place on prepared sheet tray. Keep in freezer while making cereal mixture, at least 30 minutes.\n" +
                "In a medium skillet over medium heat, melt butter. Add corn cereal and cinnamon and cook, stirring occasionally, until the cereal turns golden, 5 to 7 minutes. Remove from heat and stir in sugar. Place on a shallow bowl and let cool.\n" +
                "Remove ice cream balls from freezer and roll in cereal ");
        boolean  w= dbHelper.insertData("wedding cack"," INGREDIENTS\n" +
                "1 pint ice cream (such as Breyers Delights Vanilla Cupcake Ice Cream)\n" +
                "1 1/2 tbsp. butter\n" +
                "1 1/4 c. corn cereal, crushed\n" +
                "1/2 tsp. ground cinnamon\n" +
                "2 tsp. granulated sugar\n" +
                "Whipped cream, for garnish\n" +
                "Sprinkles, for garnish\n" +
                "4 maraschino cherries, for garnish\n" +
                "DIRECTIONS\n" +
                "Line a small sheet tray with parchment paper and place in freezer. Scoop ice cream into 4 balls and place on prepared sheet tray. Keep in freezer while making cereal mixture, at least 30 minutes.\n" +
                "In a medium skillet over medium heat, melt butter. Add corn cereal and cinnamon and cook, stirring occasionally, until the cereal turns golden, 5 to 7 minutes. Remove from heat and stir in sugar. Place on a shallow bowl and let cool.\n" +
                "Remove ice cream balls from freezer and roll in cereal mixture…");
        boolean  r= dbHelper.insertData("lemon cack"," INGREDIENTS\n" +
                "1 pint ice cream (such as Breyers Delights Vanilla Cupcake Ice Cream)\n" +
                "1 1/2 tbsp. butter\n" +
                "1 1/4 c. corn cereal, crushed\n" +
                "1/2 tsp. ground cinnamon\n" +
                "2 tsp. granulated sugar\n" +
                "Whipped cream, for garnish\n" +
                "Sprinkles, for garnish\n" +
                "4 maraschino cherries, for garnish\n" +
                "DIRECTIONS\n" +
                "Line a small sheet tray with parchment paper and place in freezer. Scoop ice cream into 4 balls and place on prepared sheet tray. Keep in freezer while making cereal mixture, at least 30 minutes.\n" +
                "In a medium skillet over medium heat, melt butter. Add corn cereal and cinnamon and cook, stirring occasionally, until the cereal turns golden, 5 to 7 minutes. Remove from heat and stir in sugar. Place on a shallow bowl and let cool.\n" +
                "Remove ice cream balls from freezer and roll in cereal mixture…");
        boolean  o= dbHelper.insertData("creem cack","INGREDIENTS\n" +
                "1 pint ice cream (such as Breyers Delights Vanilla Cupcake Ice Cream)\n" +
                "1 1/2 tbsp. butter\n" +
                "1 1/4 c. corn cereal, crushed\n" +
                "1/2 tsp. ground cinnamon\n" +
                "2 tsp. granulated sugar\n" +
                "Whipped cream, for garnish\n" +
                "Sprinkles, for garnish\n" +
                "4 maraschino cherries, for garnish\n" +
                "DIRECTIONS\n" +
                "Line a small sheet tray with parchment paper and place in freezer. Scoop ice cream into 4 balls and place on prepared sheet tray. Keep in freezer while making cereal mixture, at least 30 minutes.\n" +
                "In a medium skillet over medium heat, melt butter. Add corn cereal and cinnamon and cook, stirring occasionally, until the cereal turns golden, 5 to 7 minutes. Remove from heat and stir in sugar. Place on a shallow bowl and let cool.\n" +
                "Remove ice cream balls from freezer and roll in cereal mixture…");

        if(isInserted&&cocktail&& mintjuice&& milkshake && cocumberjuice&& lemonjuice&& bluecocktail && bananashake&&
                redcocktail&&a&&b&&c&&co&&l&&f&&e&&d&&o&&r&&w&&p&&n&&m&&x&&z)
        {
           // Toast.makeText(this,"inserted" ,Toast.LENGTH_SHORT).show();
        }

    }
    public void move(View v)

    {
        Intent intent = new Intent(MainActivity.this, signup.class);
        startActivity(intent);

    }


    public void check(View v) {

       name=editText1.getText().toString().trim();
     email=editText2.getText().toString();
         password=editText3.getText().toString();
        if (!name.isEmpty()
                && !email.isEmpty()
                && !password.isEmpty()) {


             Intent g = new Intent(MainActivity.this, option.class);
             startActivity(g);
        } else {
            builder.setMessage(" Please add all fields ! ");
            builder.setCancelable(false);
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {


                }
            });


            AlertDialog alert = builder.create();

            alert.setTitle("Alert");
            alert.show();
        }


    }
}