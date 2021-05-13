object book extends App{
  def countPrice(copies:Int):Double={
    var shippingCost:Double=0;
    var solidPrice:Double=copies*0.6*24.95;
    if(copies<0){
      print("Invalid No of Books : ");
      return copies;
    }
    else if(copies<=50){
      shippingCost=3*copies;
    }
    else {
      shippingCost=(copies-50)*0.75+150;
    }
    return shippingCost+solidPrice;
  }

  print ("Total wholesale cost = "+ countPrice(51));
}
