package terminal.terminalExecute;

import service.StudentServiceImpl;

public class DelStudentByFioExecutable implements CommandExecutable{
    private String fio;
    private StudentServiceImpl studentServiceImpl;


    public DelStudentByFioExecutable(String fio) {
        this.fio = fio;
    }

    @Override
    public void execute() {
        this.studentServiceImpl.removeUserByFio(fio);
    }
}
