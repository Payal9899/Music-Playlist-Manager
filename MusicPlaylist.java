import java.util.*;
public class Playlist {
static ArrayList<Song>al=new ArrayList<Song>();
static Scanner sc=new Scanner(System.in);
static Song s;
public static void addsong()
{
System.out.println("Enter how many song you want to add ");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
	s=new Song();
	System.out.println("Enter id");
	s.setid(sc.nextInt());
	System.out.println("Enter song name");
	s.setsongname(sc.next());
	System.out.println("Enter the singer name");
	s.setsingername(sc.next());
	System.out.println("Enter the moviename");
	s.setmoviename(sc.next());
	System.out.println("Enter the composser name");
	s.setcompossername(sc.next());
	System.out.println("Enter the lyricsticname");
	s.setlyricsticname(sc.next());
	System.out.println("Enter the size of the song");
	s.setsize(sc.nextInt());
	al.add(s);
}
}
public static void showallsongs()
{
	if (al.isEmpty())
	{
		System.out.print("songlist is empty...., please add songs to the playlist.....");
		addsong();
	}
	else
	{
		for(int i=0;i<al.size();i++)
		{
			System.out.println("Song name-"+al.get(i).getsongname()+" and id-"+al.get(i).getid());
		}
	}
}
public static void removesong()
{
showallsongs();
System.out.println("Enter the id of the song you want to remove");
int x=sc.nextInt();
for(int i=0;i<al.size();i++)
{
	if (al.get(i).getid()==x)
	{
		al.remove(i);
		System.out.println("Successfully deleted.....");
	}
	else
	{
		System.out.println("invalid id");
	}
}
}
public static void updatesong()
{
	System.out.println("Enter the id of the song you want to update..");
	int opti=sc.nextInt();
	for(int j=0;al.get(j).getid()==opti;j++)
	{
System.out.println("do you want to update song id.??\nfor Yes press 1\nfor No press 0");
int a=sc.nextInt();
if(a==1) {
        System.out.println("Enter the new id ");
		al.get(j).setid(sc.nextInt());}
System.out.println("do you want to update song name.??\nfor Yes press 1\nfor No press 0");
int b=sc.nextInt();
if(b==1) {
		System.out.println("Enter the new songname ");
		al.get(j).setsongname(sc.next());}
System.out.println("do you want to update singer name.??\nfor Yes press 1\nfor No press 0");
int c=sc.nextInt();
		if(c==1) {
		System.out.println("Enter the new singername ");
		al.get(j).setsingername(sc.next());}
System.out.println("do you want to update movie name.??\nfor Yes press 1\nfor No press 0");
int d=sc.nextInt();
		if(d==1) {
		System.out.println("Enter the new moviename ");
		al.get(j).setmoviename(sc.next());}
System.out.println("do you want to update composser name.??\nfor Yes press 1\nfor No press 0");
int e=sc.nextInt();
		if(e==1) {
		System.out.println("Enter the new compossername ");
		al.get(j).setcompossername(sc.next());}
System.out.println("do you want to update lyricsticname.??\nfor Yes press 1\nfor No press 0");
int f=sc.nextInt();
		if(f==1) {
		System.out.println("Enter the new lyricsticname ");
		al.get(j).setlyricsticname(sc.next());}
System.out.println("do you want to update song size.??\nfor Yes press 1\nfor No press 0");
int g=sc.nextInt();
		if(g==1) {
		System.out.println("Enter the new size ");
		al.get(j).setsize(sc.nextInt());}
}
}
public static void playsong()
{
	showallsongs();
	System.out.println("Enter your choice of playing songs.......\nfor specific song......Press 1\nfor serially playing....Press 2\n for random songs...Press3");
	int option=sc.nextInt();
	int min=al.get(0).getid();
	int max=al.get(al.size()-1).getid();
	switch(option)
	{
	case 1:
		System.out.print("Enter the specificsong id ");
		int idx=sc.nextInt();
		for(int i=0;al.get(i).getid()==idx;i++) {
		System.out.print(al.get(i).getsongname()+"is playing");}
		break;
	case 2:
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getsongname()+"is playing");
		}
		break;
	case 3:
		for(int i=0;i<al.size();i++)
		{
			int idy=(int)Math.random()*(((max-min)+1)+1);
			if(al.get(i).getid()==idy)
			{
				System.out.print(al.get(i).getsongname()+"is playing");
			}
			else
			break;
			}
		default :
			System.out.print("invalid option");
			break;
}
}
public static void main(String args[])
{
	
	boolean loop=true;
	while(loop=true)
	{
		System.out.print("Enter your choice\n");
		System.out.println("for addsong...Press 1\nfor removesong...Press2\nfor updatesong....Press3\nfor showallsong...Press4\nfor play song...Press5\nfor exit...Press6");
		int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		addsong();
		break;
	case 2:
		removesong();
		break;
	case 3:
		updatesong();
		break;
	case 4:
		showallsongs();
		break;
	case 5:
		playsong();
		break;
	case 6:
		loop=false;
	   
	}	
	}
}
}