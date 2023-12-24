//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//design and create
//your Toy class
//Use the lab handout
//and sample runner
//code provided
//to help you

public class Toy
{

    String name;
    int num;
    public Toy (String name)
    {
        this.name = name;
        num = 1;
    }

    public void setCount(int num)
    {
        this.num = num;
    }

    public int getCount()
    {
        return num;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return (name + " " + num);
    }

}
