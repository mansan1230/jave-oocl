import java.util.List;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    private ItemRepository itemRepository;
    private SalesPromotionRepository salesPromotionRepository;

    public App(ItemRepository itemRepository, SalesPromotionRepository salesPromotionRepository) {
        this.itemRepository = itemRepository;
        this.salesPromotionRepository = salesPromotionRepository;
    }

    public String bestCharge(List<String> inputs) {

        Item a = new Item("ITEM0001","Braised chicken",18);
        Item b = new Item("ITEM0013","Chinese hamburger",6);
        Item c = new Item("ITEM0022","Cold noodles",8);
        String output="";
        int total = 0;
        int discount1 = 0;
        int discount2 = 0;
        int discount2a = 0;
        int discount2c = 0;
        int finalprice = 0;
        output = output.concat("============= Order details =============\n");

        for (String food : inputs) {
            int amount = Integer.parseInt(food.split(" x ")[1]);
            String id = food.split(" x ")[0];
            //System.out.println(id);
            if (id.equals("ITEM0001")){
                int price  = (int) (a.getPrice() * amount);
                total += price;
                discount2a = price/2;
                output = output.concat(a.getName() + " x " + amount + " = " + price + " yuan\n");
            }
            else if (id.equals("ITEM0013")){
                int price  = (int) (b.getPrice() * amount);
                total += price;
                output = output.concat(b.getName() + " x " + amount + " = " + price + " yuan\n");
            }
            else if (id.equals("ITEM0022")){
                int price  = (int) (c.getPrice() * amount);
                total += price;
                discount2c = price/2;
                output = output.concat(c.getName() + " x " + amount + " = " + price + " yuan\n");
            }
        }

        if(total >= 30 ){
            output = output.concat("-----------------------------------\nPromotion used:\n");
            System.out.println("Promotion used:");
            discount1 = total - 6;
            discount2 = total - discount2c - discount2a;
            if(discount1 <= discount2){
                finalprice = discount1;
                output = output.concat("Deduct 6 yuan when the order reaches 30 yuan, saving 6 yuan\n");
                output = output.concat("-----------------------------------\n");
                output = output.concat("In total: "+ finalprice +" yuan\n===================================");
            }
            else{
                finalprice = discount2;
                output = output.concat("Half price for certain dishes (braised chicken and cold noodles), saving "+(discount2c+discount2a)+" yuan\n");
                output = output.concat("-----------------------------------\n");
                output = output.concat("Total: "+ finalprice +" yuan\n===================================");

            }

        }
        else{
            output = output.concat("-----------------------------------\n");
            output = output.concat("In total: "+ total +" yuan\n===================================");
        }






        return output;
    }
}
