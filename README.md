# result
![] (https://github.com/ppc-ntu-khpi/35---classes-and-modifiers-Polygon228/blob/main/images/test.png)
```java
package test.domain;
public class Customer
{
   private int id=1;
   private boolean isNew=true;
   private float total=1000;
   public void displayInfo()
   {
       System.out.println("Id "+id);
       System.out.println("IsNew "+isNew);
       System.out.println("total "+total);
   }

    public Customer()
    {
    }
   
    public Customer(int id,boolean isNew,float total)
    {
        this.id=id;
        this.isNew=isNew;
        this.total=total;
    }
    public int getId()
    {
        return id;
    }

    public void setId(int Id)
    {
        this.id = Id;
    }

    public boolean isIsNew()
    {
        return isNew;
    }

    public void setIsNew(boolean IsNew)
    {
        this.isNew = IsNew;
    }

    public float getTotal()
    {
        return total;
    }

    public void setTotal(float Total)
    {
        this.total = Total;
    }
   
}


