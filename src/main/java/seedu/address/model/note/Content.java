package seedu.address.model.note;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

import seedu.address.model.person.Name;

public class Content {

    public static final String MESSAGE_CONSTRAINTS =
            "Content should only contain alphanumeric characters, spaces, special characters, it should not be blank " +
                    "and no maximum length";

    public static final String VALIDATION_REGEX = "[\\p{ASCII}][\\p{ASCII}]*";

    public final String fullContent;

    public Content(String content){
        requireNonNull(content);
        checkArgument(isValidContent(content), MESSAGE_CONSTRAINTS);
        fullContent = content;
    }

    public static boolean isValidContent(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return this.fullContent;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Content // instanceof handles nulls
                && fullContent.equals(((Content) other).fullContent)); // state check
    }
}
