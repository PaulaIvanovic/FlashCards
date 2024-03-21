package HelloGit;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import java.io.FileInputStream;

public class PptxReader {
    public static void main(String[] args) {
        // Path to the .pptx file
        String filePath = "C:\\Users\\jovic\\OneDrive\\Desktop\\Prog.ing. - PROJEKT\\PrimjerPrez2.pptx";
        
        try (FileInputStream fis = new FileInputStream(filePath);
             XMLSlideShow ppt = new XMLSlideShow(fis)) {
            
            // Iterate over the slides
            for (XSLFSlide slide : ppt.getSlides()) {
                // Iterate over the shapes in the slide
                for (XSLFShape shape : slide.getShapes()) {
                    if (shape instanceof XSLFTextShape) {
                        XSLFTextShape txtShape = (XSLFTextShape) shape;
                        System.out.println(txtShape.getText());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

