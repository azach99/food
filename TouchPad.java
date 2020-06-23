package food;

import java.awt.Color;
import java.text.DecimalFormat;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * TouchPadClass
 * @author Zach Amados
 * @version 12.30.2019
 *
 */
public class TouchPad {
    private Color yellowish;
    private Color purplish;
    private Color babyBlue;
    private Color salmon;
    private Color mintGreen;
    private Color pinkPastel;
    private Color something;
    private Color redPastel;
    private Color blueish;
    private Window turnerWindow;
    private Window window;
    private Window bagWindow;
    private Window drinkWindow;
    private Shape itemOne;
    private Shape itemTwo;
    private Shape itemThree;
    private Shape itemFour;
    private Shape itemFive;
    private Shape itemSix;
    private Shape itemSeven;
    private Shape itemEight;
    private Shape itemNine;
    private Shape itemTen;
    private Shape itemEleven;
    private Shape itemTwelve;
    private Shape item13;
    private Shape item14;
    private Shape item15;
    private Shape item16;
    private Shape item17;
    private Shape item18;
    private Shape otherData;
    private Shape studentShape;
    private TextShape banhMi;
    private TextShape adobo;
    private TextShape gyoza;
    private TextShape shumai;
    private TextShape siopao;
    private TextShape spaghetti;
    private TextShape fries;
    private TextShape corn;
    private TextShape radish;
    private TextShape water;
    private TextShape soda;
    private TextShape icedTea;
    private TextShape chicken;
    private TextShape beef;
    private TextShape shrimp;
    private TextShape salmonPoke;
    private TextShape hokieRoll;
    private TextShape pangPang;
    private int shapeWidth;
    private int shapeHeight;
    private Button refresh;
    private Button pay;
    private Button cancelItem;
    private Button bag;
    private double price;
    private TextShape total;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private Receipt receipt;
    private TextShape studentBool;
    private boolean studentBoolean;
    private Button refreshBagButton;
    private Shape otherTotal;
    private TextShape otherTotalText;
    private TextShape order;
    private TextShape total2;
    private Button drinkRefresh;
    //private FoodOrder fOrder;
    private Button finalize;
    private int orderNumber;
    private TextShape number;
    private ArrayQueue kitchenQueue;
    //private Window kitchenWindow;
    private boolean finalPressed;
    private Button getOrder;
    private Button refreshSpecialties;
    private Shape bagBackground;
    
    public TouchPad() throws Exception {
        blueish = new Color(120, 233, 255);
        yellowish = new Color(253, 255, 216);
        purplish = new Color(227, 217, 238);
        babyBlue = new Color(211, 249, 255);
        salmon = new Color(255, 174, 159);
        mintGreen = new Color(152, 255, 152);
        pinkPastel = new Color( 255, 209, 220);
        something = new Color(255, 213, 153);
        redPastel = new Color(255, 105, 97);
        window = new Window("Food Truck");
        bagWindow = new Window("Bag");
        shapeWidth = window.getGraphPanelWidth() / 3;
        shapeHeight = window.getGraphPanelHeight() / 2;
        itemOne = new Shape(0, 0, shapeWidth, shapeHeight, Color.GREEN);
        window.addShape(itemOne);
        itemTwo = new Shape(window.getGraphPanelWidth() / 2, 0, shapeWidth, shapeHeight, Color.YELLOW);
        window.addShape(itemTwo);
        refresh = new Button("Refresh");
        refresh.onClick(this, "refreshFood");
        window.addButton(refresh, WindowSide.NORTH);
        itemTwo.move(-shapeWidth / 2, 0);
        itemThree = new Shape(window.getGraphPanelWidth() - shapeWidth, 0, shapeWidth, shapeHeight, Color.GREEN);
        window.addShape(itemThree);
        itemFour = new Shape(0, window.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, Color.YELLOW);
        window.addShape(itemFour);
        itemFive = new Shape(window.getGraphPanelWidth() / 2, window.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, Color.GREEN);
        window.addShape(itemFive);
        itemFive.move(-shapeWidth / 2, 0);
        itemSix = new Shape(window.getGraphPanelWidth() - shapeWidth, window.getGraphPanelHeight() / 2, shapeWidth, shapeHeight, Color.YELLOW);
        window.addShape(itemSix);
        banhMi = new TextShape(shapeWidth / 2, shapeHeight / 2, "Banh Mi: $6.99");
        window.addShape(banhMi);
        window.moveToFront(banhMi);
        banhMi.move(-banhMi.getWidth() / 2, -banhMi.getHeight() / 2);
        banhMi.setBackgroundColor(Color.GREEN);
        adobo = new TextShape((shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Adobo: $10.99");
        window.addShape(adobo);
        window.moveToFront(adobo);
        adobo.move(-adobo.getWidth() / 2,  -adobo.getHeight() / 2);
        adobo.setBackgroundColor(Color.YELLOW);
        gyoza = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Gyoza: $4.59");
        window.addShape(gyoza);
        window.moveToFront(gyoza);
        gyoza.move(-gyoza.getWidth() / 2, -gyoza.getHeight() / 2);
        gyoza.setBackgroundColor(Color.GREEN);
        shumai = new TextShape(shapeWidth / 2, (shapeHeight) + (shapeHeight / 2), "Shrimp Shumai: $13.54");
        window.addShape(shumai);
        window.moveToFront(shumai);
        shumai.move(-shumai.getWidth() / 2,  -shumai.getHeight() / 2);
        shumai.setBackgroundColor(Color.YELLOW);
        siopao = new TextShape((shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "Siopao: $3.91");
        window.addShape(siopao);
        window.moveToFront(siopao);
        siopao.move(-siopao.getWidth() / 2, -siopao.getHeight() / 2);
        siopao.setBackgroundColor(Color.GREEN);
        price = 0.00;
        spaghetti = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "");
        spaghetti.setText("Spaghetti: $7.99");
        window.addShape(spaghetti);
        window.moveToFront(spaghetti);
        spaghetti.move(-spaghetti.getWidth() / 2, -spaghetti.getHeight() / 2);
        spaghetti.setBackgroundColor(Color.YELLOW);
        receipt = new Receipt();
        itemOne.onClick(this, "clickedItemOne");
        itemTwo.onClick(this, "clickedItemTwo");
        itemThree.onClick(this, "clickedItemThree");
        itemFour.onClick(this, "clickedItemFour");
        itemFive.onClick(this, "clickedItemFive");
        banhMi.onClick(this, "clickedItemOne");
        adobo.onClick(this, "clickedItemTwo");
        gyoza.onClick(this, "clickedItemThree");
        shumai.onClick(this, "clickedItemFour");
        siopao.onClick(this, "clickedItemFive");

        drinkWindow = new Window("Sides and Drinks");
        itemSeven = new Shape(0, 0, shapeWidth, shapeHeight, Color.GREEN);
        drinkWindow.addShape(itemSeven);
        itemEight = new Shape(window.getGraphPanelWidth() / 2, 0, shapeWidth, shapeHeight, Color.YELLOW);
        drinkWindow.addShape(itemEight);
        itemEight.move(-shapeWidth / 2, 0);
        drinkRefresh = new Button("Refresh");
        drinkRefresh.onClick(this, "refreshDrink");
        drinkWindow.addButton(drinkRefresh, WindowSide.NORTH);
        itemNine = new Shape(window.getGraphPanelWidth() - shapeWidth, 0, shapeWidth, shapeHeight, Color.GREEN);
        drinkWindow.addShape(itemNine);
        itemTen = new Shape(0, window.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, Color.YELLOW);
        drinkWindow.addShape(itemTen);
        itemEleven = new Shape(window.getGraphPanelWidth() / 2, window.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, Color.GREEN);
        drinkWindow.addShape(itemEleven);
        itemEleven.move(-shapeWidth / 2, 0);
        itemTwelve = new Shape(window.getGraphPanelWidth() - shapeWidth, window.getGraphPanelHeight() / 2, shapeWidth, shapeHeight, Color.YELLOW);
        drinkWindow.addShape(itemTwelve);
        
        fries = new TextShape(shapeWidth / 2, shapeHeight / 2, "French Fries: $1.59");
        drinkWindow.addShape(fries);
        drinkWindow.moveToFront(fries);
        fries.move(-fries.getWidth() / 2, -fries.getHeight() / 2);
        fries.setBackgroundColor(Color.GREEN);
        corn = new TextShape((shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Corn: $0.99");
        drinkWindow.addShape(corn);
        drinkWindow.moveToFront(corn);
        corn.move(-corn.getWidth() / 2,  -corn.getHeight() / 2);
        corn.setBackgroundColor(Color.YELLOW);
        radish = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Pickled Radish: $1.14");
        drinkWindow.addShape(radish);
        drinkWindow.moveToFront(radish);
        radish.move(-radish.getWidth() / 2, -radish.getHeight() / 2);
        radish.setBackgroundColor(Color.GREEN);
        water = new TextShape(shapeWidth / 2, (shapeHeight) + (shapeHeight / 2), "Water: $0.00");
        drinkWindow.addShape(water);
        drinkWindow.moveToFront(water);
        water.move(-water.getWidth() / 2,  -water.getHeight() / 2);
        water.setBackgroundColor(Color.YELLOW);
        soda = new TextShape((shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "Soda: $0.75");
        drinkWindow.addShape(soda);
        drinkWindow.moveToFront(soda);
        soda.move(-soda.getWidth() / 2, -soda.getHeight() / 2);
        soda.setBackgroundColor(Color.GREEN);
        itemSeven.onClick(this, "clickedItemSeven");
        itemEight.onClick(this, "clickedItemEight");
        itemNine.onClick(this, "clickedItemNine");
        itemTen.onClick(this, "clickedItemTen");
        itemEleven.onClick(this, "clickedItemEleven");
        banhMi.onClick(this, "clickedItemSeven");
        adobo.onClick(this, "clickedItemEight");
        gyoza.onClick(this, "clickedItemNine");
        shumai.onClick(this, "clickedItemTen");
        siopao.onClick(this, "clickedItemEleven");
        icedTea = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "");
        icedTea.setText("Fiesta Iced Tea: $1.89");
        drinkWindow.addShape(icedTea);
        drinkWindow.moveToFront(icedTea);
        icedTea.move(-icedTea.getWidth() / 2, -icedTea.getHeight() / 2);
        icedTea.setBackgroundColor(Color.YELLOW);
        itemTwelve.onClick(this, "clickedItemTwelve");
        icedTea.onClick(this, "clickedItemTwelve");
        
        bagBackground = new Shape(0, bagWindow.getGraphPanelHeight() / 5, bagWindow.getGraphPanelWidth(), bagWindow.getGraphPanelHeight() - (bagWindow.getGraphPanelHeight() / 5), blueish);
        bagWindow.addShape(bagBackground);
        studentShape = new Shape(0, 0, bagWindow.getGraphPanelWidth() / 2, bagWindow.getGraphPanelHeight() / 5, redPastel);
        bagWindow.addShape(studentShape);
        studentBool = new TextShape(studentShape.getWidth() / 2, studentShape.getHeight() / 2, "Student: No");
        studentBoolean = false;
        studentBool.move(-studentBool.getWidth() / 2, -studentBool.getHeight() / 2);
        bagWindow.addShape(studentBool);
        bagWindow.moveToFront(studentBool);
        studentBool.setBackgroundColor(redPastel);
        refreshBagButton = new Button("Refresh");
        bagWindow.addButton(refreshBagButton, WindowSide.NORTH);
        refreshBagButton.onClick(this, "refreshBag");
        studentShape.onClick(this, "updateStudent");
        studentBool.onClick(this, "updateStudent");
        otherTotal = new Shape(bagWindow.getGraphPanelWidth() / 2, 0, bagWindow.getGraphPanelWidth() / 2, bagWindow.getGraphPanelHeight() / 5, new Color(241, 255, 100));
        bagWindow.addShape(otherTotal);
        otherTotalText = new TextShape((3 * bagWindow.getGraphPanelWidth() / 4), otherTotal.getHeight() / 2, "");
        otherTotalText.setText("Subtotal: $" + price + " | Total: $" + price);
        otherTotalText.move(-otherTotalText.getWidth() / 2, -otherTotalText.getHeight() / 2);
        bagWindow.addShape(otherTotalText);
        bagWindow.moveToFront(otherTotalText);
        otherTotalText.setBackgroundColor(new Color(241, 255, 100));
        displayOrders();
        itemSix.onClick(this, "clickedItemSix");
        spaghetti.onClick(this,"clickedItemSix");
        pay = new Button("Pay");
        bagWindow.addButton(pay, WindowSide.SOUTH);
        pay.onClick(this, "payOrder");
        finalize = new Button("Finalize");
        bagWindow.addButton(finalize, WindowSide.SOUTH);
        orderNumber = 0;
        number = null;
        finalize.onClick(this, "finalizeOrder");
        turnerWindow = new Window("Turner's Specialties");
        
        
        
        
        //SOMETHING NEW HERE!!!!
        item13 = new Shape(0, 0, shapeWidth, shapeHeight, Color.GREEN);
        turnerWindow.addShape(item13);
        item14 = new Shape(window.getGraphPanelWidth() / 2, 0, shapeWidth, shapeHeight, Color.YELLOW);
        turnerWindow.addShape(item14);
        item14.move(-shapeWidth / 2, 0);
        //drinkRefresh = new Button("Refresh");
        //drinkRefresh.onClick(this, "refreshDrink");
        //drinkWindow.addButton(drinkRefresh, WindowSide.NORTH);
        item15 = new Shape(window.getGraphPanelWidth() - shapeWidth, 0, shapeWidth, shapeHeight, Color.GREEN);
        turnerWindow.addShape(item15);
        item16 = new Shape(0, window.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, Color.YELLOW);
        turnerWindow.addShape(item16);
        item17 = new Shape(window.getGraphPanelWidth() / 2, window.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, Color.GREEN);
        turnerWindow.addShape(item17);
        item17.move(-shapeWidth / 2, 0);
        item18 = new Shape(window.getGraphPanelWidth() - shapeWidth, window.getGraphPanelHeight() / 2, shapeWidth, shapeHeight, Color.YELLOW);
        turnerWindow.addShape(item18);
        
        chicken = new TextShape(shapeWidth / 2, shapeHeight / 2, "Chicken: $9.95");
        turnerWindow.addShape(chicken);
        turnerWindow.moveToFront(chicken);
        chicken.move(-chicken.getWidth() / 2, -chicken.getHeight() / 2);
        chicken.setBackgroundColor(Color.GREEN);
        beef = new TextShape((shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Beef: $10.95");
        turnerWindow.addShape(beef);
        turnerWindow.moveToFront(beef);
        beef.move(-beef.getWidth() / 2,  -beef.getHeight() / 2);
        beef.setBackgroundColor(Color.YELLOW);
        shrimp = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Shrimp: $10.95");
        turnerWindow.addShape(shrimp);
        turnerWindow.moveToFront(shrimp);
        shrimp.move(-radish.getWidth() / 2, -radish.getHeight() / 2);
        shrimp.setBackgroundColor(Color.GREEN);
        salmonPoke = new TextShape(shapeWidth / 2, (shapeHeight) + (shapeHeight / 2), "Salmon Poke: $6.95");
        turnerWindow.addShape(salmonPoke);
        turnerWindow.moveToFront(salmonPoke);
        salmonPoke.move(-water.getWidth() / 2,  -water.getHeight() / 2);
        salmonPoke.setBackgroundColor(Color.YELLOW);
        hokieRoll = new TextShape((shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "Hokie Roll: $7.95");
        turnerWindow.addShape(hokieRoll);
        turnerWindow.moveToFront(hokieRoll);
        hokieRoll.move(-soda.getWidth() / 2, -soda.getHeight() / 2);
        hokieRoll.setBackgroundColor(Color.GREEN);
        item13.onClick(this, "clickedItem13");
        item14.onClick(this, "clickedItem14");
        item15.onClick(this, "clickedItem15");
        item16.onClick(this, "clickedItem16");
        item17.onClick(this, "clickedItem17");
        chicken.onClick(this, "clickedItem13");
        beef.onClick(this, "clickedItem14");
        shrimp.onClick(this, "clickedItem15");
        salmonPoke.onClick(this, "clickedItem16");
        hokieRoll.onClick(this, "clickedItem17");
        pangPang = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "");
        pangPang.setText("Chicken Pang Pang: $7.00");
        turnerWindow.addShape(pangPang);
        turnerWindow.moveToFront(pangPang);
        pangPang.move(-icedTea.getWidth() / 2, -icedTea.getHeight() / 2);
        pangPang.setBackgroundColor(Color.YELLOW);
        item18.onClick(this, "clickedItem18");
        pangPang.onClick(this, "clickedItem18");
        refreshSpecialties = new Button("Refresh");
        turnerWindow.addButton(refreshSpecialties, WindowSide.NORTH);
        refreshSpecialties.onClick(this, "refreshSpecialties");
    }
    public void refreshSpecialties(Button button) throws Exception {
//        turnerWindow.removeAllShapes();
//        shapeWidth = window.getGraphPanelWidth() / 3;
//        shapeHeight = window.getGraphPanelHeight() / 2;
//        item13 = new Shape(0, 0, shapeWidth, shapeHeight, Color.GREEN);
//        turnerWindow.addShape(item13);
//        item14 = new Shape(window.getGraphPanelWidth() / 2, 0, shapeWidth, shapeHeight, Color.YELLOW);
//        turnerWindow.addShape(item14);
//        item14.move(-shapeWidth / 2, 0);
//        //drinkRefresh = new Button("Refresh");
//        //drinkRefresh.onClick(this, "refreshDrink");
//        //drinkWindow.addButton(drinkRefresh, WindowSide.NORTH);
//        item15 = new Shape(window.getGraphPanelWidth() - shapeWidth, 0, shapeWidth, shapeHeight, Color.GREEN);
//        turnerWindow.addShape(item15);
//        item16 = new Shape(0, window.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, Color.YELLOW);
//        turnerWindow.addShape(item16);
//        item17 = new Shape(window.getGraphPanelWidth() / 2, window.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, Color.GREEN);
//        turnerWindow.addShape(item17);
//        item17.move(-shapeWidth / 2, 0);
//        item18 = new Shape(window.getGraphPanelWidth() - shapeWidth, window.getGraphPanelHeight() / 2, shapeWidth, shapeHeight, Color.YELLOW);
//        turnerWindow.addShape(item18);
//        shapeWidth = drinkWindow.getGraphPanelWidth() / 3;
//        shapeHeight = drinkWindow.getGraphPanelHeight() / 2;
//        chicken = new TextShape(shapeWidth / 2, shapeHeight / 2, "Chicken: $9.95");
//        turnerWindow.addShape(chicken);
//        turnerWindow.moveToFront(chicken);
//        chicken.move(-chicken.getWidth() / 2, -chicken.getHeight() / 2);
//        chicken.setBackgroundColor(Color.GREEN);
//        beef = new TextShape((shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Beef: $10.95");
//        turnerWindow.addShape(beef);
//        turnerWindow.moveToFront(beef);
//        beef.move(-beef.getWidth() / 2,  -beef.getHeight() / 2);
//        beef.setBackgroundColor(Color.YELLOW);
//        shrimp = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Shrimp: $10.95");
//        turnerWindow.addShape(shrimp);
//        turnerWindow.moveToFront(shrimp);
//        shrimp.move(-radish.getWidth() / 2, -radish.getHeight() / 2);
//        shrimp.setBackgroundColor(Color.GREEN);
//        salmonPoke = new TextShape(shapeWidth / 2, (shapeHeight) + (shapeHeight / 2), "Salmon Poke: $6.95");
//        turnerWindow.addShape(salmonPoke);
//        turnerWindow.moveToFront(salmonPoke);
//        salmonPoke.move(-water.getWidth() / 2,  -water.getHeight() / 2);
//        salmonPoke.setBackgroundColor(Color.YELLOW);
//        hokieRoll = new TextShape((shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "Hokie Roll: $7.95");
//        turnerWindow.addShape(hokieRoll);
//        turnerWindow.moveToFront(hokieRoll);
//        hokieRoll.move(-soda.getWidth() / 2, -soda.getHeight() / 2);
//        hokieRoll.setBackgroundColor(Color.GREEN);
//        item13.onClick(this, "clickedItem13");
//        item14.onClick(this, "clickedItem14");
//        item15.onClick(this, "clickedItem15");
//        item16.onClick(this, "clickedItem16");
//        item17.onClick(this, "clickedItem17");
//        chicken.onClick(this, "clickedItem13");
//        beef.onClick(this, "clickedItem14");
//        shrimp.onClick(this, "clickedItem15");
//        salmonPoke.onClick(this, "clickedItem16");
//        hokieRoll.onClick(this, "clickedItem17");
//        pangPang = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "");
//        pangPang.setText("Chicken Pang Pang: $7.00");
//        turnerWindow.addShape(pangPang);
//        turnerWindow.moveToFront(pangPang);
//        pangPang.move(-icedTea.getWidth() / 2, -icedTea.getHeight() / 2);
//        pangPang.setBackgroundColor(Color.YELLOW);
//        item18.onClick(this, "clickedItem18");
//        pangPang.onClick(this, "clickedItem18");
        turnerWindow.removeAllShapes();
        shapeWidth = turnerWindow.getGraphPanelWidth() / 3;
        shapeHeight = turnerWindow.getGraphPanelHeight() / 2;
        item13 = new Shape(0, 0, shapeWidth, shapeHeight, mintGreen);
        turnerWindow.addShape(item13);
        item14 = new Shape(turnerWindow.getGraphPanelWidth() / 3, 0, shapeWidth, shapeHeight, yellowish);
        turnerWindow.addShape(item14);
        item15 = new Shape(turnerWindow.getGraphPanelWidth() - shapeWidth, 0, shapeWidth, shapeHeight, mintGreen);
        turnerWindow.addShape(item15);
        item16 = new Shape(0, turnerWindow.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, yellowish);
        turnerWindow.addShape(item16);
        item17 = new Shape(turnerWindow.getGraphPanelWidth() / 2, turnerWindow.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, mintGreen);
        turnerWindow.addShape(item17);
        item17.move(-shapeWidth / 2, 0);
        item18 = new Shape(turnerWindow.getGraphPanelWidth() - shapeWidth, turnerWindow.getGraphPanelHeight() / 2, shapeWidth, shapeHeight, yellowish);
        turnerWindow.addShape(item18);
        chicken = new TextShape(shapeWidth / 2, shapeHeight / 2, "Chicken: $9.95");
        turnerWindow.addShape(chicken);
        turnerWindow.moveToFront(chicken);
        chicken.move(-chicken.getWidth() / 2, -chicken.getHeight() / 2);
        chicken.setBackgroundColor(mintGreen);
        beef = new TextShape((shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Beef: $10.95");
        turnerWindow.addShape(beef);
        turnerWindow.moveToFront(beef);
        beef.move(-beef.getWidth() / 2,  -beef.getHeight() / 2);
        beef.setBackgroundColor(yellowish);
        shrimp = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Chicken: $10.95");
        turnerWindow.addShape(shrimp);
        turnerWindow.moveToFront(shrimp);
        shrimp.move(-shrimp.getWidth() / 2, -shrimp.getHeight() / 2);
        shrimp.setBackgroundColor(mintGreen);
        salmonPoke = new TextShape(shapeWidth / 2, (shapeHeight) + (shapeHeight / 2), "Salmon Poke: $6.95");
        turnerWindow.addShape(salmonPoke);
        turnerWindow.moveToFront(salmonPoke);
        salmonPoke.move(-salmonPoke.getWidth() / 2,  -salmonPoke.getHeight() / 2);
        salmonPoke.setBackgroundColor(yellowish);
        hokieRoll = new TextShape((shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "Hokie Roll: $7.95");
        turnerWindow.addShape(hokieRoll);
        turnerWindow.moveToFront(hokieRoll);
        hokieRoll.move(-hokieRoll.getWidth() / 2, -hokieRoll.getHeight() / 2);
        hokieRoll.setBackgroundColor(mintGreen);
        item13.onClick(this, "clickedItem13");
        item14.onClick(this, "clickedItem14");
        item15.onClick(this, "clickedItem15");
        item16.onClick(this, "clickedItem16");
        item17.onClick(this, "clickedItem17");
        chicken.onClick(this, "clickedItem13");
        beef.onClick(this, "clickedItem14");
        shrimp.onClick(this, "clickedItem15");
        salmonPoke.onClick(this, "clickedItem16");
        hokieRoll.onClick(this, "clickedItem17");
        pangPang = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "");
        pangPang.setText("Pang Pang Salad: $7.00");
        turnerWindow.addShape(pangPang);
        turnerWindow.moveToFront(pangPang);
        pangPang.move(-pangPang.getWidth() / 2, -pangPang.getHeight() / 2);
        pangPang.setBackgroundColor(yellowish);
        displayOrders();
        item18.onClick(this, "clickedItem18");
        pangPang.onClick(this, "clickedItem18");
        
    }
    public void clickedItem13(Shape shape) throws Exception {
        receipt.order(12);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        turnerWindow.moveToFront(chicken);
        //turnerWindow.moveToFront(item13);
        turnerWindow.moveToFront(beef);
        //turnerWindow.moveToFront(item14);
        turnerWindow.moveToFront(shrimp);
        //turnerWindow.moveToFront(item15);
        turnerWindow.moveToFront(salmonPoke);
        //turnerWindow.moveToFront(item16);
        turnerWindow.moveToFront(hokieRoll);
        //turnerWindow.moveToFront(item17);
        turnerWindow.moveToFront(pangPang);
        //turnerWindow.moveToFront(item18);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItem14(Shape shape) throws Exception {
        receipt.order(13);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        turnerWindow.moveToFront(beef);
        //turnerWindow.moveToFront(item14);
        turnerWindow.moveToFront(chicken);
        //turnerWindow.moveToFront(item13);
        turnerWindow.moveToFront(shrimp);
        //turnerWindow.moveToFront(item15);
        turnerWindow.moveToFront(salmonPoke);
        //turnerWindow.moveToFront(item16);
        turnerWindow.moveToFront(hokieRoll);
        //turnerWindow.moveToFront(item17);
        turnerWindow.moveToFront(pangPang);
        //turnerWindow.moveToFront(item18);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItem15(Shape shape) throws Exception {
        receipt.order(14);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        turnerWindow.moveToFront(shrimp);
        //turnerWindow.moveToFront(item15);
        turnerWindow.moveToFront(chicken);
        //turnerWindow.moveToFront(item13);
        turnerWindow.moveToFront(beef);
        //turnerWindow.moveToFront(item14);
        turnerWindow.moveToFront(salmonPoke);
        //turnerWindow.moveToFront(item16);
        turnerWindow.moveToFront(hokieRoll);
        //turnerWindow.moveToFront(item17);
        turnerWindow.moveToFront(pangPang);
        //turnerWindow.moveToFront(item18);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItem16(Shape shape) throws Exception {
        receipt.order(15);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        turnerWindow.moveToFront(salmonPoke);
        //turnerWindow.moveToFront(item16);
        turnerWindow.moveToFront(chicken);
        //turnerWindow.moveToFront(item13);
        turnerWindow.moveToFront(beef);
        //turnerWindow.moveToFront(item14);
        turnerWindow.moveToFront(shrimp);
        //turnerWindow.moveToFront(item15);
        turnerWindow.moveToFront(hokieRoll);
        //turnerWindow.moveToFront(item17);
        turnerWindow.moveToFront(pangPang);
        //turnerWindow.moveToFront(item18);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItem17(Shape shape) throws Exception {
        receipt.order(16);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        turnerWindow.moveToFront(hokieRoll);
        //turnerWindow.moveToFront(item17);
        turnerWindow.moveToFront(chicken);
        //turnerWindow.moveToFront(item13);
        turnerWindow.moveToFront(beef);
        //turnerWindow.moveToFront(item14);
        turnerWindow.moveToFront(shrimp);
        //turnerWindow.moveToFront(item15);
        turnerWindow.moveToFront(salmonPoke);
        //turnerWindow.moveToFront(item16);
        turnerWindow.moveToFront(pangPang);
        //turnerWindow.moveToFront(item18);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItem18(Shape shape) throws Exception {
        receipt.order(17);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        turnerWindow.moveToFront(pangPang);
        //turnerWindow.moveToFront(item18);
        turnerWindow.moveToFront(chicken);
        //turnerWindow.moveToFront(item13);
        turnerWindow.moveToFront(beef);
        //turnerWindow.moveToFront(item14);
        turnerWindow.moveToFront(shrimp);
        //turnerWindow.moveToFront(item15);
        turnerWindow.moveToFront(salmonPoke);
        //turnerWindow.moveToFront(item16);
        turnerWindow.moveToFront(hokieRoll);
        //turnerWindow.moveToFront(item17);
        displayOrders();
        updateTotal2(price);

    }
    public void finalizeOrder(Button button) throws Exception {
        bagWindow.removeAllShapes();
        studentShape = new Shape(0, 0, bagWindow.getGraphPanelWidth() / 2, bagWindow.getGraphPanelHeight() / 5, redPastel);
        bagWindow.addShape(studentShape);
        studentBool = new TextShape(studentShape.getWidth() / 2, studentShape.getHeight() / 2, "Student: No");
        studentBoolean = false;
        studentBool.move(-studentBool.getWidth() / 2, -studentBool.getHeight() / 2);
        bagWindow.addShape(studentBool);
        bagWindow.moveToFront(studentBool);
        studentBool.setBackgroundColor(redPastel);
        studentShape.onClick(this, "updateStudent");
        studentBool.onClick(this, "updateStudent");
        otherTotal = new Shape(bagWindow.getGraphPanelWidth() / 2, 0, bagWindow.getGraphPanelWidth() / 2, bagWindow.getGraphPanelHeight() / 5, new Color(241, 255, 100));
        bagWindow.addShape(otherTotal);
        otherTotalText = new TextShape((3 * bagWindow.getGraphPanelWidth() / 4), otherTotal.getHeight() / 2, "");
        otherTotalText.setText("Subtotal: $" + price + " | Total: $" + price);
        otherTotalText.move(-otherTotalText.getWidth() / 2, -otherTotalText.getHeight() / 2);
        bagWindow.addShape(otherTotalText);
        bagWindow.moveToFront(otherTotalText);
        otherTotalText.setBackgroundColor(new Color(241, 255, 100));
        price = 0.00;
        receipt.getCustomerBag().clear();
        finalPressed = true;
        receipt.initTotal();
        updateTotal2(price); 
        orderNumber++;
    }
    public void payOrder(Button button) throws Exception {
        if (number != null) {
            bagWindow.removeShape(number);
        }
        number = new TextShape(3 * bagWindow.getGraphPanelWidth() / 4, 0, "");
        number.setText("Order Number: " + orderNumber);
        number.move(-number.getWidth() / 2, studentShape.getHeight());
        number.move(0, number.getHeight());
        bagWindow.addShape(number);
        number.setBackgroundColor(Color.WHITE);
        int j = 0;
        for (int i = 0 ; i < receipt.getCustomerBag().getCurrentSize(); i++) {
            order = new TextShape(bagWindow.getGraphPanelWidth() / 4, 0, "");
            order.setText(receipt.getCustomerBag().get(i).toString());
            order.move(bagWindow.getWidth() / 2, studentShape.getHeight());
            order.move(-order.getWidth() / 2, -order.getHeight() / 2);
            order.move(0, order.getHeight() * (i + 3));
            bagWindow.addShape(order);
            order.setBackgroundColor(Color.WHITE);
            j = i;
        }
        TextShape totalText = new TextShape((bagWindow.getGraphPanelWidth() * 3) / 4, 0, "");
        totalText.move(0,  order.getHeight() * (j + 4));
        if (studentBoolean == false) {
            totalText.setText("Total: $" + String.valueOf(df2.format(price)));
        }
        else {
            totalText.setText("Total: $" + String.valueOf(df2.format(price / 2)));
        }
        totalText.move(-totalText.getWidth() / 2, 0);
        bagWindow.addShape(totalText);
        totalText.move(0, order.getHeight() * (j + 3));
        totalText.setBackgroundColor(Color.WHITE);        
    }
    public void refreshFood(Button button) throws Exception {
        window.removeAllShapes();
        shapeWidth = window.getGraphPanelWidth() / 3;
        shapeHeight = window.getGraphPanelHeight() / 2;
        itemOne = new Shape(0, 0, shapeWidth, shapeHeight, babyBlue);
        window.addShape(itemOne);
        itemTwo = new Shape(window.getGraphPanelWidth() / 3, 0, shapeWidth, shapeHeight, pinkPastel);
        window.addShape(itemTwo);
        itemThree = new Shape(window.getGraphPanelWidth() - shapeWidth, 0, shapeWidth, shapeHeight, babyBlue);
        window.addShape(itemThree);
        itemFour = new Shape(0, window.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, pinkPastel);
        window.addShape(itemFour);
        itemFive = new Shape(window.getGraphPanelWidth() / 2, window.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, babyBlue);
        window.addShape(itemFive);
        itemFive.move(-shapeWidth / 2, 0);
        itemSix = new Shape(window.getGraphPanelWidth() - shapeWidth, window.getGraphPanelHeight() / 2, shapeWidth, shapeHeight, pinkPastel);
        window.addShape(itemSix);
        banhMi = new TextShape(shapeWidth / 2, shapeHeight / 2, "Banh Mi: $6.99");
        window.addShape(banhMi);
        window.moveToFront(banhMi);
        banhMi.move(-banhMi.getWidth() / 2, -banhMi.getHeight() / 2);
        banhMi.setBackgroundColor(babyBlue);
        adobo = new TextShape((shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Adobo: $10.99");
        window.addShape(adobo);
        window.moveToFront(adobo);
        adobo.move(-adobo.getWidth() / 2,  -adobo.getHeight() / 2);
        adobo.setBackgroundColor(pinkPastel);
        gyoza = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Gyoza: $4.59");
        window.addShape(gyoza);
        window.moveToFront(gyoza);
        gyoza.move(-gyoza.getWidth() / 2, -gyoza.getHeight() / 2);
        gyoza.setBackgroundColor(babyBlue);
        shumai = new TextShape(shapeWidth / 2, (shapeHeight) + (shapeHeight / 2), "Shrimp Shumai: $13.54");
        window.addShape(shumai);
        window.moveToFront(shumai);
        shumai.move(-shumai.getWidth() / 2,  -shumai.getHeight() / 2);
        shumai.setBackgroundColor(pinkPastel);
        siopao = new TextShape((shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "Siopao: $3.91");
        window.addShape(siopao);
        window.moveToFront(siopao);
        siopao.move(-siopao.getWidth() / 2, -siopao.getHeight() / 2);
        siopao.setBackgroundColor(babyBlue);
        itemOne.onClick(this, "clickedItemOne");
        itemTwo.onClick(this, "clickedItemTwo");
        itemThree.onClick(this, "clickedItemThree");
        itemFour.onClick(this, "clickedItemFour");
        itemFive.onClick(this, "clickedItemFive");
        banhMi.onClick(this, "clickedItemOne");
        adobo.onClick(this, "clickedItemTwo");
        gyoza.onClick(this, "clickedItemThree");
        shumai.onClick(this, "clickedItemFour");
        siopao.onClick(this, "clickedItemFive");
        spaghetti = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "");
        spaghetti.setText("Spaghetti: $7.99");
        window.addShape(spaghetti);
        window.moveToFront(spaghetti);
        spaghetti.move(-spaghetti.getWidth() / 2, -spaghetti.getHeight() / 2);
        spaghetti.setBackgroundColor(pinkPastel);
        itemSix.onClick(this, "clickedItemSix");
        spaghetti.onClick(this, "clickedItemSix");
        displayOrders();
        
    }
    public void refreshBag(Button button) throws Exception {
        bagWindow.removeAllShapes();
        bagBackground = new Shape(0, bagWindow.getGraphPanelHeight() / 5, bagWindow.getGraphPanelWidth(), bagWindow.getGraphPanelHeight() - (bagWindow.getGraphPanelHeight() / 5), blueish);
        bagWindow.addShape(bagBackground);
        studentShape = new Shape(0, 0, bagWindow.getGraphPanelWidth() / 2, bagWindow.getGraphPanelHeight() / 5, redPastel);
        bagWindow.addShape(studentShape);
        studentBool = new TextShape(studentShape.getWidth() / 2, studentShape.getHeight() / 2, "Student: No");
        studentBoolean = false;
        studentBool.move(-studentBool.getWidth() / 2, -studentBool.getHeight() / 2);
        bagWindow.addShape(studentBool);
        bagWindow.moveToFront(studentBool);
        studentBool.setBackgroundColor(redPastel);
        studentShape.onClick(this, "updateStudent");
        studentBool.onClick(this, "updateStudent");
        otherTotal = new Shape(bagWindow.getGraphPanelWidth() / 2, 0, bagWindow.getGraphPanelWidth() / 2, bagWindow.getGraphPanelHeight() / 5, new Color(241, 255, 100));
        bagWindow.addShape(otherTotal);
        otherTotalText = new TextShape((3 * bagWindow.getGraphPanelWidth() / 4), otherTotal.getHeight() / 2, "");
        otherTotalText.setText("Subtotal: $" + price + " | Total: $" + price);
        otherTotalText.move(-otherTotalText.getWidth() / 2, -otherTotalText.getHeight() / 2);
        bagWindow.addShape(otherTotalText);
        bagWindow.moveToFront(otherTotalText);
        otherTotalText.setBackgroundColor(new Color(241, 255, 100));
        displayOrders();
    }
    
    public void refreshDrink(Button button) throws Exception {
        drinkWindow.removeAllShapes();
        shapeWidth = drinkWindow.getGraphPanelWidth() / 3;
        shapeHeight = drinkWindow.getGraphPanelHeight() / 2;
        itemSeven = new Shape(0, 0, shapeWidth, shapeHeight, salmon);
        drinkWindow.addShape(itemSeven);
        itemEight = new Shape(drinkWindow.getGraphPanelWidth() / 3, 0, shapeWidth, shapeHeight, purplish);
        drinkWindow.addShape(itemEight);
        itemNine = new Shape(drinkWindow.getGraphPanelWidth() - shapeWidth, 0, shapeWidth, shapeHeight, salmon);
        drinkWindow.addShape(itemNine);
        itemTen = new Shape(0, drinkWindow.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, purplish);
        drinkWindow.addShape(itemTen);
        itemEleven = new Shape(drinkWindow.getGraphPanelWidth() / 2, drinkWindow.getGraphPanelHeight() - shapeHeight, shapeWidth, shapeHeight, salmon);
        drinkWindow.addShape(itemEleven);
        itemEleven.move(-shapeWidth / 2, 0);
        itemTwelve = new Shape(drinkWindow.getGraphPanelWidth() - shapeWidth, drinkWindow.getGraphPanelHeight() / 2, shapeWidth, shapeHeight, purplish);
        drinkWindow.addShape(itemTwelve);
        fries = new TextShape(shapeWidth / 2, shapeHeight / 2, "French Fries: $1.59");
        drinkWindow.addShape(fries);
        drinkWindow.moveToFront(fries);
        fries.move(-fries.getWidth() / 2, -fries.getHeight() / 2);
        fries.setBackgroundColor(salmon);
        corn = new TextShape((shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Corn $0.99");
        drinkWindow.addShape(corn);
        drinkWindow.moveToFront(corn);
        corn.move(-corn.getWidth() / 2,  -corn.getHeight() / 2);
        corn.setBackgroundColor(purplish);
        radish = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), shapeHeight / 2, "Pickled Radish: $1.14");
        drinkWindow.addShape(radish);
        drinkWindow.moveToFront(radish);
        radish.move(-radish.getWidth() / 2, -radish.getHeight() / 2);
        radish.setBackgroundColor(salmon);
        water = new TextShape(shapeWidth / 2, (shapeHeight) + (shapeHeight / 2), "Water: $0.00");
        drinkWindow.addShape(water);
        drinkWindow.moveToFront(water);
        water.move(-water.getWidth() / 2,  -water.getHeight() / 2);
        water.setBackgroundColor(purplish);
        soda = new TextShape((shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "Soda: $0.75");
        drinkWindow.addShape(soda);
        drinkWindow.moveToFront(soda);
        soda.move(-soda.getWidth() / 2, -soda.getHeight() / 2);
        soda.setBackgroundColor(salmon);
        itemSeven.onClick(this, "clickedItemSeven");
        itemEight.onClick(this, "clickedItemEight");
        itemNine.onClick(this, "clickedItemNine");
        itemTen.onClick(this, "clickedItemTen");
        itemEleven.onClick(this, "clickedItemEleven");
        fries.onClick(this, "clickedItemSeven");
        corn.onClick(this, "clickedItemEight");
        radish.onClick(this, "clickedItemNine");
        water.onClick(this, "clickedItemTen");
        soda.onClick(this, "clickedItemEleven");
        icedTea = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), "");
        icedTea.setText("Mango Iced Tea: $1.89");
        drinkWindow.addShape(icedTea);
        drinkWindow.moveToFront(icedTea);
        icedTea.move(-icedTea.getWidth() / 2, -icedTea.getHeight() / 2);
        icedTea.setBackgroundColor(purplish);
        displayOrders();
        itemTwelve.onClick(this, "clickedItemTwelve");
        icedTea.onClick(this, "clickedItemTwelve");
        
    }
    public void clickedItemOne(Shape shape) throws Exception {
        receipt.order(0);
        price = receipt.getTotal();
        updateTotal2(price);
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        window.moveToFront(fries);
        window.moveToFront(corn);
        window.moveToFront(radish);
        window.moveToFront(water);
        window.moveToFront(soda);
        window.moveToFront(icedTea);
        displayOrders();
        
    }
    public void clickedItemTwo(Shape shape) throws Exception {
        receipt.order(1);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItemThree(Shape shape) throws Exception {
        receipt.order(2);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItemFour(Shape shape) throws Exception {
        receipt.order(3);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItemFive(Shape shape) throws Exception {
        receipt.order(4);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItemSix(Shape shape) throws Exception {
        receipt.order(5);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItemSeven(Shape shape) throws Exception {
        receipt.order(6);
        price = receipt.getTotal();
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItemEight(Shape shape) throws Exception {
        receipt.order(7);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItemNine(Shape shape) throws Exception {
        receipt.order(8);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItemTen(Shape shape) throws Exception {
        receipt.order(9);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItemEleven(Shape shape) throws Exception {
        receipt.order(10);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        displayOrders();
        updateTotal2(price);

    }
    public void clickedItemTwelve(Shape shape) throws Exception {
        receipt.order(11);
        price = receipt.getTotal();
        window.moveToFront(banhMi);
        window.moveToFront(adobo);
        window.moveToFront(gyoza);
        window.moveToFront(shumai);
        window.moveToFront(siopao);
        window.moveToFront(spaghetti);
        drinkWindow.moveToFront(fries);
        drinkWindow.moveToFront(corn);
        drinkWindow.moveToFront(radish);
        drinkWindow.moveToFront(water);
        drinkWindow.moveToFront(soda);
        drinkWindow.moveToFront(icedTea);
        displayOrders();
        updateTotal2(price);

    }
    public void updateTotal(double number) {
        total = new TextShape((shapeWidth) + (shapeWidth) + (shapeWidth / 2), (shapeHeight) + (shapeHeight / 2), /*"Price: " + String.valueOf(total)*/ "");
        if (!finalPressed) {
            total.setText("Total: $" + String.valueOf(df2.format(number)));
        }
        else {
            total.setText("Total: $" + 0.00);
            finalPressed = false;
        }
        //window.addShape(total);
        //window.moveToFront(total);
        total.move(-total.getWidth() / 2, -total.getHeight() / 2);
        total.setBackgroundColor(Color.ORANGE);
    }
    public void updateTotal2(double number) {
        total2 = new TextShape((3 * bagWindow.getGraphPanelWidth() / 4), otherTotal.getHeight() / 2, "");
        if (studentBoolean == false) {
            otherTotalText.setText("Subtotal: $" + String.valueOf(df2.format(number)) + " | Total: $" + String.valueOf(df2.format(number)));
        }
        else {
            double chosen = number / 2;
            otherTotalText.setText("Subtotal: $" + String.valueOf(df2.format(number)) + " | Total: $" + String.valueOf(df2.format(chosen)));
        }
        bagWindow.addShape(otherTotalText);
        bagWindow.moveToFront(otherTotalText);
        otherTotalText.setBackgroundColor(new Color(241, 255, 100));
    }
    
    public void updateStudent(Shape shape) throws Exception {
        studentBoolean = !studentBoolean;
        bagWindow.removeAllShapes();
        studentShape = new Shape(0, 0, bagWindow.getGraphPanelWidth() / 2, bagWindow.getGraphPanelHeight() / 5, redPastel);
        bagWindow.addShape(studentShape);
        if (studentBoolean == true) {
            studentBool = new TextShape(studentShape.getWidth() / 2, studentShape.getHeight() / 2, "Student: Yes");
            bagWindow.moveToFront(studentBool);
        }
        else {
            studentBool = new TextShape(studentShape.getWidth() / 2, studentShape.getHeight() / 2, "Student: No");
            bagWindow.moveToFront(studentBool);
        }
        studentBool.move(-studentBool.getWidth() / 2, -studentBool.getHeight() / 2);
        bagWindow.addShape(studentBool);
        bagWindow.moveToFront(studentBool);
        studentBool.setBackgroundColor(redPastel);
        studentShape.onClick(this, "updateStudent");
        studentBool.onClick(this, "updateStudent");
        otherTotal = new Shape(bagWindow.getGraphPanelWidth() / 2, 0, bagWindow.getGraphPanelWidth() / 2, bagWindow.getGraphPanelHeight() / 5, new Color(241, 255, 100));
        bagWindow.addShape(otherTotal);
        otherTotalText = new TextShape((3 * bagWindow.getGraphPanelWidth() / 4), otherTotal.getHeight() / 2, "");
        otherTotalText.setText("Subtotal: $" + price + " | Total: $" + price);
        otherTotalText.move(-otherTotalText.getWidth() / 2, -otherTotalText.getHeight() / 2);
        bagWindow.addShape(otherTotalText);
        bagWindow.moveToFront(otherTotalText);
        otherTotalText.setBackgroundColor(new Color(241, 255, 100));
        displayOrders();
        updateTotal2(receipt.getTotal());
    }
    public void displayOrders() throws Exception {
        for (int i = 0 ; i < receipt.getCustomerBag().getCurrentSize(); i++) {
            order = new TextShape(bagWindow.getGraphPanelWidth() / 4, 0, "");
            order.setText(receipt.getCustomerBag().get(i).toString());
            order.move(-order.getWidth() / 2, studentShape.getHeight());
            order.move(0, order.getHeight() * (i + 1));
            bagWindow.addShape(order);
            bagWindow.moveToFront(order);
            order.setBackgroundColor(blueish);
            order.onClick(this, "clickedDelete");
        }
    }
    public void clickedDelete(TextShape shape) throws Exception {
        bagWindow.removeShape(shape);
        for (int i = 0 ; i < receipt.getCustomerBag().getCurrentSize(); i++) {
            String strOne = shape.getText();
            String strTwo = receipt.getCustomerBag().get(i).toString();
            if (strOne.equals(strTwo)) {
                FoodItem out = receipt.getCustomerBag().get(i);
                price = price - out.getPrice();
                updateTotal2(price);
                receipt.getCustomerBag().remove(receipt.getCustomerBag().get(i));
            }
        } 
    }

}
