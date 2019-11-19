package zk.demo;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zkmax.ui.util.Loadingbar;
import org.zkoss.zkmax.ui.util.LoadingbarControl;

public class LoadingbarComposer extends SelectorComposer<Component> {
	private LoadingbarControl loadingbarCtrl;
	private boolean indeterminate;
	
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		loadingbarCtrl = Loadingbar.createLoadingbar("myId");
	}
	
	@Listen("onClick = #start")
	public void start() {
		loadingbarCtrl.start(5);
	}
	
	@Listen("onClick = #update30")
	public void update30() {
		loadingbarCtrl.update(30);
	}
	
	@Listen("onClick = #update60")
	public void update60() {
		loadingbarCtrl.update(60);
	}
	
	@Listen("onClick = #indeterminate")
	public void indeterminate() {
		indeterminate = !indeterminate;
		loadingbarCtrl.update(indeterminate);
	}
	
	@Listen("onClick = #finish")
	public void finish() {
		loadingbarCtrl.finish();
	}
}