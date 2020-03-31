   public class Simulator{
        public static void main(String arg[]){

            MapleTree m = new MapleTree();
            Rose r = new Rose();
            Tulip t = new Tulip();

            for(int i = 0; i < 3; i++){
                
                m.doSpring();
                t.doSpring();
                r.doSpring();
                
                m.doSummer();
                t.doSummer();
                r.doSummer();
                
                m.doFall();
                t.doFall();
                r.doFall();
                
                m.doWinter();
                t.doWinter();
                r.doWinter();
                }
            }
            }
