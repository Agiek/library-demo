package learn.java.library.demodebug.service.impl;

import learn.java.library.demodebug.service.RmsAdminServiceTest;
import learn.java.library.mapper.ReaderMapper;
import learn.java.library.model.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RmsAdminServiceTestImpl implements RmsAdminServiceTest {

    private ReaderMapper readerMapper;

    @Autowired
    public RmsAdminServiceTestImpl(ReaderMapper readerMapper) {
        this.readerMapper = readerMapper;
    }

    @Override
    public Reader getReaderById(Integer id) {
        Reader reader = readerMapper.selectByPrimaryKey(id);
        if(reader != null) {
            return reader;
        }
        return null;
    }
}
