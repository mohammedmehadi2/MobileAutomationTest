package iPhone;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagefactory.SegmentsPage.Segments;

public class TestSegments extends MobileAPI {
  Segments segments;
    @BeforeMethod
    public void initializing(){
        segments = PageFactory.initElements(ad, Segments.class);
        segments.goToSegmentsFildsTab();
    }
    @Test
    public void segmentTabValidation(){
        Assert.assertEquals(segments.goToSegments(),true);
    }
    @Test
    public void firstSegmentLeftTest(){
        Assert.assertEquals(segments.firstSegemntControlleft(),true);
    }
    @Test
    public void firstSegmentMidTest(){
        Assert.assertEquals(segments.firstSegemntControlmid(),true);
    }
    @Test
    public void firstSegmentRightTest(){
        Assert.assertEquals(segments.firstSegemntControlright(),true);
    }
    @Test
    public void secondSegmentLeftTest(){
        Assert.assertEquals(segments.secondSegemntControlleft(),true);
    }
    @Test
    public void secondSegmentMidTest(){
        Assert.assertEquals(segments.secondSegemntControlmid(),true);
    }
    @Test
    public void secondSegmentRightTest(){
        Assert.assertEquals(segments.secondSegemntControlright(),true);
    }
}
