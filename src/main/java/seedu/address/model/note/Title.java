package seedu.address.model.note;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

import seedu.address.model.person.Name;

public class Title {

    public static final String MESSAGE_CONSTRAINTS =
            "Title should only contain alphanumeric characters, spaces, special characters, it should not be blank " +
                    "and maximum length 100";

    public static final String VALIDATION_REGEX = "[\\p{ASCII}][\\p{ASCII}]{0,100}";
    //[A-Za-z0-9 _.,!'/$ ][A-Za-z0-9 _.,!/$} ]*";

    public final String fullTitle;

    public Title(String title){
        requireNonNull(title);
        checkArgument(isValidTitle(title), MESSAGE_CONSTRAINTS);
        fullTitle = title;
    }

    public static boolean isValidTitle(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return this.fullTitle;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Title // instanceof handles nulls
                && fullTitle.equals(((Title) other).fullTitle)); // state check
    }

}
