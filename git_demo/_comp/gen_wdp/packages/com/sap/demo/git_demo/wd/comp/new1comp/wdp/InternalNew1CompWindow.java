
// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator
// DON'T MODIFY!!! CHANGES WILL BE LOST WHENEVER THE FILE GETS GENERATED AGAIN
//
// $JL-GENERATED-SOURCE$
// ---------------------------------------------------------------------------
package com.sap.demo.git_demo.wd.comp.new1comp.wdp;

import com.sap.tc.cmi.metadata.CMICardinality;
import com.sap.tc.webdynpro.progmodel.api.*;
import com.sap.tc.webdynpro.progmodel.gci.*;
import com.sap.tc.webdynpro.progmodel.context.*;

@SuppressWarnings("all")
public class InternalNew1CompWindow
  extends com.sap.tc.webdynpro.progmodel.gci.impl.GCIWindowController
  implements IPrivateNew1CompWindow, com.sap.tc.webdynpro.progmodel.gci.IGCIViewDelegate
{
  private static final long serialVersionUID = 0x7c19827c3e41983eL;

  /**
   * Framework implementation of Controller that delegates to this.
   */
  private final com.sap.tc.webdynpro.progmodel.gci.IGCIView wdAlterEgo;

  /**
   * Delegate that implements application defined logic.
   */
  private final com.sap.demo.git_demo.wd.comp.new1comp.New1CompWindow delegate;


  // ---- Context --------------------------------------------------------------

  IGCINodeInfo infoContext;

  {

    infoContext = GCIContext.createValueNode("Context", true, CMICardinality.ONE, CMICardinality.ONE, true, null,
      (IGCIAttributeInfo[])null, // no attributes
      (IGCINodeInfo[])null // no child nodes
    );

  }
  
  private IContextNode contextNode;

  private void wdInitContextNode() {
    contextNode = new IContextNode(this, infoContext, (Node)null);
  }

  public IWDNode wdGetRootNode() {
    return contextNode;
  }

  public IContextNode wdGetContext() {
    return contextNode;
  }


  // ---- Actions --------------------------------------------------------------

  /**
   * Create a new action for this controller. A unique name for the action is generated automatially.
   * @param eventHandler is the action's eventhandler with proper signature
   * @param text is the text displayed in the UI element triggering this action
   */
  public IWDAction wdCreateAction(WDActionEventHandler eventHandler, String text) {
    return wdAlterEgo.createAction(null, eventHandler, text, null);
  }

  /**
   * Create a new action with the given name for this controller.
   * @param eventHandler is the action's eventhandler with proper signature
   * @param name is the action's name
   * @param text is the text displayed in the UI element triggering this action
   */
  public IWDAction wdCreateNamedAction(WDActionEventHandler eventHandler, String name, String text) {
    return wdAlterEgo.createAction(name, eventHandler, text, null);
  }
  
  // ---- Controller part ------------------------------------------------------

  /**
   * Creates a new instance of this controller.
   */
  public InternalNew1CompWindow(com.sap.tc.webdynpro.progmodel.gci.IGCIView alterEgo) {
    super(alterEgo);
    this.wdAlterEgo = alterEgo;
    wdInitContextNode();
    this.delegate = new com.sap.demo.git_demo.wd.comp.new1comp.New1CompWindow((IPrivateNew1CompWindow) this);
  }

  /**
   * Returns the public API for this controller instance.
   */
  public com.sap.tc.webdynpro.progmodel.api.IWDWindowController wdGetAPI() {
    return (com.sap.tc.webdynpro.progmodel.api.IWDWindowController) wdAlterEgo;
  }

  /**
   * Hook method called to initialize window controller.
   */
  public void wdDoInit() {
    delegate.wdDoInit();
  }

  /**
   * Hook method called to clean up window controller.
   */
  public void wdDoExit() {
    delegate.wdDoExit();
  }

  public Object wdInvokeEventHandler(String handlerName, IWDCustomEvent event)
    throws NoSuchMethodException {
    
      if("onPlugDefault".equals(handlerName)) {

        delegate.onPlugDefault(event );
        return null;
      }
      throw new NoSuchMethodException("Eventhandler " + handlerName + " not found for event " + event.getName());
  }


  public void onPlugDefault(IWDCustomEvent wdEvent ) {
    delegate.onPlugDefault(wdEvent );
  }



  // ---- UI Tree ---------------------------------------------------------

  // create UI tree
  public com.sap.tc.webdynpro.progmodel.api.IWDViewElement wdCreateUITree()
  {
    return null; // other view like controllers (i.e. windows) have no UI tree
  }


  /**
   * Hook method called to modify view before rendering. Access to UI elements
   * is via the given view API only!
   * 
   * @param view The view's generic API, as provided by Web Dynpro.
   *        Provides access to UI elements.
   * @param firstTime indicates whether the hook is called for the first time
   * during the lifetime of this view
   */
  public void wdDoModifyView(IWDView view, boolean firstTime) {
     delegate.wdDoModifyView(view, firstTime);
  }

  /**
   * Hook method called to do additional validation of user input.
   * 
   * @param validation gives access to report validation errors
   */
  public void wdDoBeforeAction(com.sap.tc.webdynpro.progmodel.api.IWDBeforeAction validation) {
    delegate.wdDoBeforeAction(validation);
  }


}
