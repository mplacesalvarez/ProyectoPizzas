public class Pizzas {

    public static void main (String [ ] args) {

        Pizza pizza1=new Pizza();

              pizza1.setMasa("normal");
                    pizza1.setCebolla(false);
                    pizza1.setChampiñones(false);
                    pizza1.setPiña(true);
                    pizza1.setJamon(true);
                    pizza1.setExtraQueso(false);
                    pizza1.setSalsa(false);
                    pizza1.setRelleno(false);
                    pizza1.setTipo_salsa("No");
                    pizza1.setTipo(2);
                    pizza1.setSinGluten(false);


            Pizza pizza2=new Pizza("fina",true,3,false,"solo tomate",false, true,false,false,true,true);
        System.out.println(pizza1.toString());
        System.out.println(pizza2.toString());



        }



    }


