package mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SecurityCenterTest {

    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */

    @Mock
    private DoorPanel doorPanel;

    @InjectMocks
    private SecurityCenter securityCenter;

    @Test
    public void shouldVerifyDoorIsClosed() {
        // 修改了DoorPanel中的close方法，令其有返回值
        // 调用mock对象的switchOn()方法，判断其是否有返回值，以确定是否调用的是Mock对象的方法
        assertEquals(null, securityCenter.switchOn());
        verify(doorPanel, Mockito.only()).close();
    }
}
