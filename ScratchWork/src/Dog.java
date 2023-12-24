public class Dog
{
    private String voice;

    public void setVoice(String v)
    {
        voice = v;
    }
    private void barkOnce()
    {
        System.out.println(voice);
    }
    public void barkTwice()
    {
        barkOnce();
        barkOnce();
    }
    public String toString()
    {
        return voice;
    }
}