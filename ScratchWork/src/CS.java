public class CS {

    int q = 0;
    public void go(int i)
    {
        if (i==0)
            q++;
        for(int j = 0; j<i; j++)
        {
            go2(i-1);
        }
    }

    public void go2(int i)
    {
        if (i==0)
            q++;
        for (int j = 0; j<i; j++)
        {
            go(i-1);
        }
    }
    public int getQ()
    {
        return q;
    }
}
