package ph.cg.budgets.ui.page;

import java.util.Date;

import org.apache.click.ActionResult;
import org.apache.click.Control;
import org.apache.click.Page;
import org.apache.click.ajax.DefaultAjaxBehavior;
import org.apache.click.control.ActionLink;

public class AjaxBehaviorPage extends Page {

	private static final long serialVersionUID = 1L;

	private ActionLink link = new ActionLink("link", "here");

	public AjaxBehaviorPage() {
		link.setId("link-id");

		addControl(link);

		// Add a DefaultAjaxBehavior to the link. The DefaultAjaxBehavior will
		// be invoked when the
		// link is clicked.
		link.addBehavior(new DefaultAjaxBehavior() {
			@Override
			public ActionResult onAction(Control source) {
				// Formatted date instance that will be added to the
				String now = format.date(new Date(), "dd MMM yyyy HH:mm:ss");
				String msg = "AjaxBehavior <tt>onAction()</tt> method invoked at: "
						+ now;

				// Return an action result containing the message
				return new ActionResult(msg, ActionResult.HTML);
			}
		});
	}
}
