package terminal.command;

import java.util.List;

public class Command {

    public static final String ADD = "add";
    public static final String DEL = "delete";
    public static final String NAME = "-name";
    public static final String AGEGROUP = "-ag";
    public static final String NAMEAGEGROUP = "-nag";
    private String action;
    private List<String> args;

    public Command(String action, List<String> args) {
        this.action = action;
        this.args = args;
    }

    public String getFirstArgument() {
        return args.get(0);
    }

    public String getSecondArgumentStr() {
        return args.get(1);
    }

    public Integer getSecondArgumentInt() {
        return Integer.parseInt(args.get(1));
    }

    public Integer getThirdArgument() {
        return Integer.parseInt(args.get(2));
    }

    public Integer getFourthArgument() {
        return Integer.parseInt(args.get(3));
    }

    public boolean isCreateCommandByName() {
        if (args.size() == 2) {
            return (this.action.equals(ADD) && getFirstArgument().equals(NAME));
        }
        return false;
    }

    public boolean isCreateCommandByNameAgeGroup() {
        if (args.size() == 4) {
            return (this.action.equals(ADD) && getFirstArgument().equals(NAMEAGEGROUP));
        }
        return false;
    }

    public boolean isDelByNameCommand() {
        if (args.size() == 2) {
            return (this.action.equals(DEL) && getFirstArgument().equals(NAME));
        }
        return false;
    }

    public boolean isDelByAgeGroupCommand() {
        if (args.size() == 2) {
            return (this.action.equals(DEL) && getFirstArgument().equals(AGEGROUP));
        }
        return false;
    }
}