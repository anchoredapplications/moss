/*    */ public class OS {
/*    */   private String osLabel;
/*    */   private String osNum;
/*    */   private String ordering;
/*    */   
/*    */   public OS(String osLabel, String osNum, String ordering) {
/*  7 */     this.osLabel = osLabel;
/*  8 */     this.osNum = osNum;
/*  9 */     setOrdering(ordering);
/*    */   }
/*    */   
/*    */   public String getOsLabel() {
/* 13 */     return this.osLabel;
/*    */   }
/*    */   public void setOsLabel(String osLabel) {
/* 16 */     this.osLabel = osLabel;
/*    */   }
/*    */   public String getOsNum() {
/* 19 */     return this.osNum;
/*    */   }
/*    */   public void setOsNum(String osNum) {
/* 22 */     this.osNum = osNum;
/*    */   }
/*    */   
/*    */   public String getOrdering() {
/* 26 */     return this.ordering;
/*    */   }
/*    */   
/*    */   public void setOrdering(String ordering) {
/* 30 */     this.ordering = ordering;
/*    */   }
/*    */ }


/* Location:              /home/jeremiah_gage/moss_app/moss_application.jar!/OS.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */