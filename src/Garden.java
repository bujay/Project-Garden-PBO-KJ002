import java.util.ArrayList;

public class Garden {
 private int SIZE = 10;
 int nTanaman = 0;
 int urutan = 1;
 private ArrayList<Plant> pArrList;
 int hasilPanen;
 public Garden(String pName){
 pArrList = new ArrayList<>(10);
 
 }
 public Garden(){
 this("Kebun Bunga");
 }

 public boolean addPlant(Anggrek a){
 if(nTanaman<SIZE){
 pArrList.add(a);
 nTanaman++;
 return true;
 }else{
 return false;
 }
 }
 public boolean addPlant(Mawar b){
 if(nTanaman<SIZE){
 pArrList.add(b);
 nTanaman++;
 return true;
 }else{
 return false;
 }
 }
 public boolean addPlant(Melati c){
 if(nTanaman<SIZE){
 pArrList.add(c);
 nTanaman++;
 return true;
 }else{
 return false;
 }
 }
 public int harvestPlant(){
 int tmpN = 0;
 int i = 0;
 while((pArrList != null)&&(i<pArrList.size())){
 if(pArrList.get(i).getStatusTumbuh()>=4){
 pArrList.remove(i);
 nTanaman--;
 tmpN++;
 i = 0;
 }else{
 i++;
 }
 }
 hasilPanen = hasilPanen + (tmpN);
 return tmpN;
 }

 public void beriAir(){
 for(int i = 0; i<pArrList.size(); i++){
 pArrList.get(i).beriAir();
 }
 }
 public void beriPupuk(){
 for(int i = 0; i<pArrList.size(); i++){
 pArrList.get(i).beriPupuk();
 }
 }
 public int getHasilPanen(){
 return hasilPanen;
 }
}