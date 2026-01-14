/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.sirius.analysis.constants;

import org.polarsys.capella.common.mdsofa.common.constant.ICommonConstants;

/**
 * Centralizes constants about tools.
 */

@SuppressWarnings("nls")
public interface IToolNameConstants {

  // New Diagram Tools convention (tool name should be the same across all diagrams where the tool is available)
  // =================================================================================================

  String TOOL_CREATE_FUNCTION = "function"; //$NON-NLS-1$
  String TOOL_CREATE_FUNCTION_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_CREATE_FUNCTION_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_CREATE_FUNCTION_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_CREATE_FUNCTION_SELECT = "select"; //$NON-NLS-1$
  String TOOL_CREATE_FUNCTION_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_CREATE_INPUT_PORT = "input.port"; //$NON-NLS-1$
  String TOOL_CREATE_OUTPUT_PORT = "output.port"; //$NON-NLS-1$
  String TOOL_CREATE_FUNCTIONAL_EXCHANGE = "functional.exchange"; //$NON-NLS-1$
  String TOOL_CREATE_FUNCTIONAL_CHAIN = "functional.chain"; //$NON-NLS-1$
  String TOOL_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_CREATE_OPERATIONAL_ROLE = "operational.role"; //$NON-NLS-1$
  String TOOL_CREATE_OPERATIONAL_ACTIVITY = "operational.activity"; //$NON-NLS-1$
  String TOOL_CREATE_INTERACTION = "interaction"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_FUNCTION_PORT = "function.ports"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_FUNCTIONS = "functions"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_FUNCTIONAL_EXCHANGES = "functional.exchanges"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_FUNCTIONAL_CHAINS = "functional.chains"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_EXCHANGE_CATEGORIES = "exchange.categories"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_OPERATIONAL_ROLES = "operational.roles"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_INTERACTIONS = "interactions"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_ALLOCATED_ACTIVITIES = "allocated.activities"; //$NON-NLS-1$
  String TOOL_SHOW_ALL_ALLOCATED_ACTIVITIES = "all.allocated.activities"; //$NON-NLS-1$
  String TOOL_MANAGE_ACTIVITY_ALLOCATION = "manage.activity.allocation"; //$NON-NLS-1$
  String TOOL_SWITCH_FUNCTIONAL_EXCHANGE_CATEGORIES = "switch.functional.exchanges.categories"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_SWITCH_FUNCTIONAL_EXCHANGE_CATEGORY = "switch.functional.exchanges.categories"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_PV = "applied.property.values"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_PVG = "applied.property.value.groups"; //$NON-NLS-1$

  // Accelerators
  String TOOL_INITIALIZATION_FROM_EXISTING_DIAGRAM = "initialization.from.existing.diagram"; //$NON-NLS-1$

  String TOOL_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_CREATE_COMPONENT = "component"; //$NON-NLS-1$
  String TOOL_CREATE_BEHAVIOR_COMPONENT = "behavior.pc"; //$NON-NLS-1$
  String TOOL_CREATE_NODE_COMPONENT = "node.pc"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_ALLOCATED_FUNCTION = "allocated.function"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_STATE_MODE = "state.mode"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_INSERT_REMOVE_COMPONENTS = "components"; //$NON-NLS-1$

  // Sequence Diagram Tools operands
  String TOOL_CREATE_REFERENCE = "reference"; //$NON-NLS-1$
  String TOOL_CREATE_LOOP = "loop"; //$NON-NLS-1$
  String TOOL_CREATE_ALT = "alt"; //$NON-NLS-1$
  String TOOL_CREATE_PAR = "par"; //$NON-NLS-1$
  String TOOL_CREATE_OTHER_COMBINED_FRAGMENT = "other.combined.fragment"; //$NON-NLS-1$
  String TOOL_CREATE_OPERAND = "operand"; //$NON-NLS-1$
  String TOOL_CREATE_COMPONENT_EXCHANGE_WITH_RETURN_BRANCH = "component.exchange.with.return.branch"; //$NON-NLS-1$
  String TOOL_CREATE_COMPONENT_EXCHANGE = "component.exchange"; //$NON-NLS-1$
  String TOOL_LOST_COMPONENT_EXCHANGE = "lost.component.exchange"; //$NON-NLS-1$
  String TOOL_FOUND_COMPONENT_EXCHANGE = "found.component.exchange"; //$NON-NLS-1$
  String TOOL_LOST_FUNCTIONAL_EXCHANGE = "lost.functional.exchange"; //$NON-NLS-1$
  String TOOL_DURATION = "duration"; //$NON-NLS-1$
  String TOOL_CREATE_FUNCTIONAL_EXCHANGE_WITH_RETURN_BRANCH = "functional.exchange.with.return.branch"; //$NON-NLS-1$
  String TOOL_CREATE_FOUND_FUNCTIONAL_EXCHANGE = "found.functional.exchange"; //$NON-NLS-1$
  String TOOL_CREATE_ARM_TIMER = "arm.timer"; //$NON-NLS-1$
  String TOOL_CREATE_CANCEL_TIMER = "cancel.timer"; //$NON-NLS-1$
  String TOOL_CREATE_MESSAGE = "create.message"; //$NON-NLS-1$
  String TOOL_DELETE_MESSAGE = "delete.message"; //$NON-NLS-1$
  String TOOL_EXCHANGE_CONTEXT = "exchange.context"; //$NON-NLS-1$

  // =================================================================================================
  // Old Diagram Tools convention
  //
  //
  // Tools that are available to multiple types of diagrams
  //
  String TOOL_COMMON_ELEMENTS_FROM_SCENARIO = "elements.from.scenario"; //$NON-NLS-1$
  String TOOL_COOMON_FUNCTIONS_FROM_MODE_STATE = "functions.from.mode.state"; //$NON-NLS-1$

  String TOOL_CREATE_PHYSICAL_PATH = "physical.path"; //$NON-NLS-1$

  // Accelerators
  String TOOL_DIAGRAMINITIALIZATION = "DiagramInitialization"; //$NON-NLS-1$
  String TOOL_STATEMODE_ELEMENTS = Messages.IToolNameConstants_62;
  String TOOL_SCENARIO_ELEMENTS = Messages.IToolNameConstants_63;
  String TOOL_SHOW_FUNCTIONAL_CHAIN_ELEMENTS = Messages.IToolNameConstants_64;

  // CC tools - Contextual Capability
  String TOOL_CC_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_CC_CREATE_MISSION = "mission"; //$NON-NLS-1$
  String TOOL_CC_CREATE_CAPABILITY = "capability"; //$NON-NLS-1$
  String TOOL_CC_CREATE_CAPABILITY_EXPLOITATION = "capability.exploitation"; //$NON-NLS-1$
  String TOOL_CC_CREATE_INVOLVED_ACTOR = "involved.actor"; //$NON-NLS-1$
  String TOOL_CC_CREATE_EXTENDS = "extends"; //$NON-NLS-1$
  String TOOL_CC_CREATE_INCLUDES = "includes"; //$NON-NLS-1$
  String TOOL_CC_CREATE_ACTOR_GENERALIZATION = "actor.generalization"; //$NON-NLS-1$
  String TOOL_CC_CREATE_CAPABILITY_GENERALIZATION = TOOL_CC_CREATE_ACTOR_GENERALIZATION;
  String TOOL_CC_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_CC_INSERT_REMOVE_MISSIONS = "missions"; //$NON-NLS-1$
  String TOOL_CC_INSERT_REMOVE_CAPABILITIES = "capabilities"; //$NON-NLS-1$
  String TOOL_CC_INSERT_REMOVE_RELATIONSHIPS = "relationships"; //$NON-NLS-1$
  String TOOL_CC_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_CC_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_CC_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_CC_RECONNECT_GENERALIZATION_SOURCE = Messages.IToolNameConstants_80;
  String TOOL_CC_RECONNECT_GENERALIZATION_TARGET = Messages.IToolNameConstants_81;

  // tool id
  String TOOL_CC_SHOW_ACTORS = Messages.IToolNameConstants_82;
  String TOOL_CC_SHOW_MISSIONS = "missions"; //$NON-NLS-1$
  String TOOL_CC_SHOW_CAPABILITY = Messages.IToolNameConstants_84;

  // CCRI Tools - Contextual Capability Realization Involvement
  String TOOL_CCRI_CREATE_CAPABILITY_REALIZATION_NODE = "capability.realization"; //$NON-NLS-1$
  String TOOL_CCRI_CREATE_ACTOR_NODE = "actor"; //$NON-NLS-1$
  String TOOL_CCRI_CREATE_COMPONENT_NODE = "component"; //$NON-NLS-1$
  String TOOL_CCRI_CREATE_CAPABILITY_REALIZATION_INVOLVEMENT_EDGE = "involvement"; //$NON-NLS-1$
  String TOOL_CCRI_INSERT_CAPABILITY_REALIZATION_NODE = "capability.realizations"; //$NON-NLS-1$
  String TOOL_CCRI_INSERT_ACTOR_NODE = "actors"; //$NON-NLS-1$
  String TOOL_CCRI_INSERT_COMPONENT_NODE = "components"; //$NON-NLS-1$
  String TOOL_CCRI_INSERT_RELATIONSHIP_EDGE = "relationships"; //$NON-NLS-1$

  // CDB Tools - Class Diagram Blank
  // Classes Tools
  String TOOL_CDB_DELETE_CONSTRAINT_ELEMENT = Messages.IToolNameConstants_93;
  String TOOL_CDB_CREATE_DATA_PACKAGE = "data.package"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_CLASS = "class"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_UNION = "union"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_COLLECTION = "collection"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_BOOLEAN_TYPE = "boolean.type"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_BOOLEAN_LITERAL = "boolean.literal"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_ENUMERATION = "enumeration"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_ENUMERATION_LITERAL = "enumeration.literal"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_NUMERIC_TYPE = "numeric.type"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_STRING_TYPE = "string.type"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_PHYSICAL_QUANTITY = "physical.quantity"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_UNIT = "unit"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_NUMERIC_REFERENCE = "numeric.reference"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_LITERAL_NUMERIC_VALUE = "literal.numeric.value"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_UNARY_EXPRESSION = "unary.expression"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_BINARY_EXPRESSION = "binary.expression"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_LITERAL_STRING_VALUE = "literal.string.value"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_STRING_REFERENCE = "string.reference"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_BOOLEAN_REFERENCE = "boolean.reference"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_COMPLEX_VALUE = "complex.value"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_COMPLEX_VALUE_REFERENCE = "complex.value.reference"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_ENUMERATION_REFERENCE = "enumeration.reference"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_COLLECTION_VALUE = "collection.value"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_COLLECTION_VALUE_REFERENCE = "collection.value.reference"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_PROPERTY = "property"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_SERVICE = "class.operation"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_PARAMETER = "parameter"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_ASSOCIATION = "association"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_AGGREGATION = "aggregation"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_COMPOSITION = "composition"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_GENERALIZATION = "generalization"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_COLLECTION_TYPE = "collection.type"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_REMOVE_DATA_PACKAGES = "data.packages"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_REMOVE_TYPES = "types"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_REMOVE_DATA_VALUES = "data.values"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_RELATIONSHIPS = "relationships"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // Unsynchronized Classes Tools
  String TOOL_CDB_INSERT_REMOVE_PROPERTIES = "properties"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_REMOVE_OPERATIONS = "operations"; //$NON-NLS-1$

  // tool id
  String TOOL_CDB_RECONNECT_ASSOCIATION_SOURCE = Messages.IToolNameConstants_135;
  String TOOL_CDB_RECONNECT_ASSOCIATION_TARGET = Messages.IToolNameConstants_136;
  String TOOL_CDB_RECONNECT_COLLECTION_TYPE = Messages.IToolNameConstants_137;
  String TOOL_CDB_RECONNECT_GENERALIZATION_SOURCE = Messages.IToolNameConstants_138;
  String TOOL_CDB_RECONNECT_GENERALIZATION_TARGET = Messages.IToolNameConstants_139;
  String TOOL_CDB_RECONNECT_EXCHANGEITEMELEMENT_SOURCE = Messages.IToolNameConstants_140;
  String TOOL_CDB_RECONNECT_EXCHANGEITEMELEMENT_TARGET = Messages.IToolNameConstants_141;

  // Communication Tools
  String TOOL_CDB_CREATE_INTERFACE_PACKAGE = "interface.package"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_INTERFACE = "interface"; //$NON-NLS-1$
  // EXCHANGE ITEMS
  String TOOL_CDB_CREATE_EI_OPERATION = "operation"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_EI_EVENT = "event"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_EI_FLOW = "flow"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_EI_DATA = "data"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_EI_UNSET = "undefined.exchange.item"; //$NON-NLS-1$
  // EXCHANGE ITEMS
  String TOOL_CDB_CREATE_EXCHANGE_ITEM_ELEMENT = "exchange.item.element"; //$NON-NLS-1$
  String TOOL_CDB_ALLOCATE_EXCHANGE_ITEM = "manage.exchange.item.allocations"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_REMOVE_INTERFACE_PACKAGES = "interface.packages"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_REMOVE_INTERFACES = "interfaces"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_REMOVE_EXCHANGE_ITEMS = "exchange.items"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_REMOVE_EXCHANGE_ITEM_ELEMENT_LINKS = "exchange.item.element.links"; //$NON-NLS-1$
  // Accelerators
  String TOOL_CDB_INITIALIZATION_FROM_EXISTING_DIAGRAM = "initialization.from.existing.diagram"; //$NON-NLS-1$
  // TOOLS ID
  String TOOL_CDB_CREATE_SIGNAL_RECEPTION = Messages.IToolNameConstants_156;
  String TOOL_CDB_SHOW_HIDE_DATAPKGS = "data.packages"; //$NON-NLS-1$
  String TOOL_CDB_SHOW_HIDE_INTERFACEPKGS = "interface.packages"; //$NON-NLS-1$
  String TOOL_CDB_INSERT_REMOVE_TYPE = "types"; //$NON-NLS-1$
  String TOOL_CDB_SHOW_HIDE_ELEMENTS = Messages.IToolNameConstants_160;
  String TOOL_CDB_SHOW_HIDE_CONSTRAINTS = Messages.IToolNameConstants_161;
  String TOOL_CDB_SHOW_HIDE_RELATIONSHIPS = Messages.IToolNameConstants_162;
  String TOOL_CDB_CREATE_DATAPKG = "data.package"; //$NON-NLS-1$
  String TOOL_CDB_CREATE_INTERFACEPKG = Messages.IToolNameConstants_164;
  String TOOL_CDB_SHOW_HIDE_INTERFACES = Messages.IToolNameConstants_165;
  String TOOL_CDB_SHOW_HIDE_EXCHANGE_ITEMS = "exchange.items"; //$NON-NLS-1$
  String TOOL_CDB_SHOW_HIDE_EXCHANGEITEMELEMENT_LINK = "exchange.item.element.links"; //$NON-NLS-1$
  String TOOL_CDB_SHOW_HIDE_DATAVALUES = Messages.IToolNameConstants_168;

  // CDI tools - Contextual Component Detailed Interfaces
  String TOOL_CDI_CREATE_INTERFACE = Messages.IToolNameConstants_169;
  String TOOL_CDI_CREATE_IN_FLOW_PORT = "in.flow.port"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_OUT_FLOW_PORT = "out.flow.port"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_INOUT_FLOW_PORT = "in.out.flow.port"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_STANDARD_PORT = "standard.port"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_IMPLEMENTS = "implements"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_USES = "uses"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_PROVIDES = "provides"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_REQUIRES = "requires"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_GENERALIZATION = "generalization"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_EVENT = "event"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_OPERATION = "operation"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_FLOW = "flow"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_DATA = "data"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_UNDEFINED_EXCHANGE_ITEM = "undefined.exchange.item"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_EXCHANGE_ITEM_ELEMENT = "exchange.item.element"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_TRANSMIT = "transmit"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_ACQUIRE = "acquire"; //$NON-NLS-1$
  String TOOL_CDI_MANAGE_EXCHANGE_ITEM_ALLOCATIONS = "manage.exchange.item.allocations"; //$NON-NLS-1$
  String TOOL_CDI_INSERT_REMOVE_INTERFACES = "interfaces"; //$NON-NLS-1$
  String TOOL_CDI_INSERT_REMOVE_EXCHANGE_ITEMS = "exchange.items"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_CDI_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_CDI_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // Unsynchronized tools
  String TOOL_CDI_INSERT_REMOVE_EXCHANGE_ITEM_ALLOCATIONS = "exchange.item.allocations"; //$NON-NLS-1$
  String TOOL_CDI_INSERT_REMOVE_EXCHANGE_ITEM_ELEMENTS = "exchange.item.elements"; //$NON-NLS-1$

  String TOOL_CDI_SHOW_HIDE_EXCHANGE_ITEMS = Messages.IToolNameConstants_195;
  String TOOL_CDI_SHOW_HIDE_INTERFACES = Messages.IToolNameConstants_196;
  String TOOL_CDI_SHOW_HIDE_EXCHANGE_ITEM_ALLOCATIONS = Messages.IToolNameConstants_197;

  // CEI tools - Contextual Component External Interface
  String TOOL_CEI_CREATE_COMPONENT = "component"; //$NON-NLS-1$
  String TOOL_CEI_REUSE_COMPONENT = "reuse.component"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_IN_FLOW_PORT = "in.flow.port"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_OUT_FLOW_PORT = "out.flow.port"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_INOUT_FLOW_PORT = "in.out.flow.port"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_STANDARD_PORT = "standard.port"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_INTERFACE = "interface"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_IMPLEMENTS = "implements"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_USES = "uses"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_PROVIDES = "provides"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_REQUIRES = "requires"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_GENERALIZATION = "generalization"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_EVENT = "event"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_OPERATION = "operation"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_FLOW = "flow"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_DATA = "data"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_UNDEFINED_EXCHANGE_ITEM = "undefined.exchange.item"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_EXCHNAGE_ITEM_ALLOCATION = "exchange.item.allocation"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_TRANSMIT = "transmit"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_ACQUIRE = "acquire"; //$NON-NLS-1$
  String TOOL_CEI_INSERT_REMOVE_COMPONENTS = "components"; //$NON-NLS-1$
  String TOOL_CEI_SHOW_HIDE_COMPONENTS = Messages.IToolNameConstants_220;
  String TOOL_CEI_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_CEI_INSERT_REMOVE_INTERFACES = "interfaces"; //$NON-NLS-1$
  String TOOL_CEI_INSERT_REMOVE_EXCHANGES_ITEMS = "exchange.items"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_CEI_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_CEI_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // CIBD tools - Configuration Items Breakdown
  String TOOL_CIBD_CREATE_COTS = "cots"; //$NON-NLS-1$
  String TOOL_CIBD_CREATE_CS = "cs"; //$NON-NLS-1$
  String TOOL_CIBD_CREATE_HW = "hw"; //$NON-NLS-1$
  String TOOL_CIBD_CREATE_INTERFACE = "interface"; //$NON-NLS-1$
  String TOOL_CIBD_CREATE_NDI = "ndi"; //$NON-NLS-1$
  String TOOL_CIBD_CREATE_PRIME_ITEM = "prime.item"; //$NON-NLS-1$
  String TOOL_CIBD_CREATE_SYSTEM = "system"; //$NON-NLS-1$
  String TOOL_CIBD_CONTAINED_IN = "contained.in"; //$NON-NLS-1$
  String TOOL_CIBD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_CIBD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_CIBD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // CM tools - Contextual Mission
  String TOOL_CM_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_CM_CREATE_CAPABILITY = "capability"; //$NON-NLS-1$
  String TOOL_CM_CREATE_CAPABILITY_EXPLOITATION = "capability.exploitation"; //$NON-NLS-1$
  String TOOL_CM_CREATE_ACTOR_INVOLVEMENT = "actor.involvement"; //$NON-NLS-1$
  String TOOL_CM_CREATE_ACTOR_GENERALIZATION = "actor.generalization"; //$NON-NLS-1$
  String TOOL_CM_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_CM_INSERT_REMOVE_CAPABILITIES = "capabilities"; //$NON-NLS-1$
  String TOOL_CM_INSERT_REMOVE_RELATIONSHIPS = "relationships"; //$NON-NLS-1$
  String TOOL_CM_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_CM_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_CM_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_CM_RECONNECT_GENERALIZATION_SOURCE = TOOL_CC_RECONNECT_GENERALIZATION_SOURCE;
  String TOOL_CM_RECONNECT_GENERALIZATION_TARGET = TOOL_CC_RECONNECT_GENERALIZATION_TARGET;

  // tool id
  String TOOL_CM_INSERT_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_CM_INSERT_CAPABILITIES = "capabilities"; //$NON-NLS-1$

  // COC - Contextual Operational Capability tools
  String TOOL_COC_CREATE_OPERATIONAL_ENTITY = "operational.entity"; //$NON-NLS-1$
  String TOOL_COC_CREATE_OPERATIONAL_ACTOR = "operational.actor"; //$NON-NLS-1$
  String TOOL_COC_CREATE_OPERATIONAL_CAPABILITY = "operational.capability"; //$NON-NLS-1$
  String TOOL_COC_CREATE_INVOLMENT = "involvement"; //$NON-NLS-1$
  String TOOL_COC_CREATE_EXTENDS = "extends"; //$NON-NLS-1$
  String TOOL_COC_CREATE_INCLUDES = "includes"; //$NON-NLS-1$
  String TOOL_COC_CREATE_OPERATIONAL_CAPABILITY_GENERALIZATION = "operational.capability.generalization"; //$NON-NLS-1$
  String TOOL_COC_INSERT_REMOVE_OPERATIONAL_ENTITIES = "operational.entities"; //$NON-NLS-1$
  String TOOL_COC_INSERT_REMOVE_OPERATIONAL_ACTORS = "operational.actors"; //$NON-NLS-1$
  String TOOL_COC_INSERT_REMOVE_OPERATIONAL_CAPABILITIES = "operational.capabilities"; //$NON-NLS-1$
  String TOOL_COC_INSERT_REMOVE_RELATIONSHIPS = "relationships"; //$NON-NLS-1$
  String TOOL_COC_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_COC_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_COC_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  String TOOL_COC_SHOW_HIDE_OPERATIONAL_ENTITY = Messages.IToolNameConstants_265;
  String TOOL_COC_SHOW_HIDE_OPERATIONAL_ACTORS = Messages.IToolNameConstants_266;
  String TOOL_COC_SHOW_HIDE_CAPABILITIES = Messages.IToolNameConstants_267;
  // CRB tools - Capability Realization Blank
  // Labels
  String TOOL_CRB_CREATE_CAPABILITY_REALIZATION = "capability.realization"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_COMPONENT = "component"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_COTS = "cots"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_CS = "cs"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_HW = "hw"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_INTERFACE = "interface"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_NDI = "ndi"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_PRIME_ITEM = "prime.item"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_SYSTEM = "system"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_ACTOR_LABEL = "actor"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_INVOLVEMENT = "involvement"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_EXTENDS = "extends"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_INCLUDES = "includes"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_ACTOR_GENERALIZATION = "actor.generalization"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_CAPABILITY_GENERALIZATION = TOOL_CRB_CREATE_ACTOR_GENERALIZATION;
  String TOOL_CRB_INSERT_REMOVE_CAPABILITY_REALIZATIONS = "capability.realizations"; //$NON-NLS-1$
  String TOOL_CRB_INSERT_REMOVE_COMPONENTS = "components"; //$NON-NLS-1$
  String TOOL_CRB_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_CRB_INSERT_REMOVE_RELATIONSHIPS = "relationships"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_CRB_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_CRB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // Names (ID) - Tool name and label are often the same excepting in the following cases
  String TOOL_CRB_CREATE_ACTOR_NAME = "actor"; //$NON-NLS-1$
  String TOOL_CRB_SHOW_HIDE_CAPABILITY_REALIZATIONS = Messages.IToolNameConstants_290;
  String TOOL_CRB_SHOW_HIDE_COMPONENTS = Messages.IToolNameConstants_291;
  String TOOL_CRB_SHOW_HIDE_ACTORS = Messages.IToolNameConstants_292;
  String TOOL_CRB_SHOW_HIDE_RELATIONSHIPS = Messages.IToolNameConstants_293;
  String TOOL_CRB_SHOW_HIDE_CONSTRAINTS = Messages.IToolNameConstants_294;
  String TOOL_CRB_RECONNECT_GENERALIZATION_SOURCE = TOOL_CC_RECONNECT_GENERALIZATION_SOURCE;
  String TOOL_CRB_RECONNECT_GENERALIZATION_TARGET = TOOL_CC_RECONNECT_GENERALIZATION_TARGET;
  // CRI tools - Contextual Capability Realization Involvement
  String TOOL_CRI_INVOLVE_COMPONENT = "involve.component"; //$NON-NLS-1$
  String TOOL_CRI_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_CRI_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_CRI_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // CSA tools - Contextual System Actors
  String TOOL_CSA_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_CSA_CREATE_ACTOR_GENERALIZATION = "actor.generalization"; //$NON-NLS-1$
  String TOOL_CSA_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_CSA_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_CSA_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_CSA_RECONNECT_GENERALIZATION_SOURCE = TOOL_CC_RECONNECT_GENERALIZATION_SOURCE;
  String TOOL_CSA_RECONNECT_GENERALIZATION_TARGET = TOOL_CC_RECONNECT_GENERALIZATION_TARGET;

  // EAB - EPBS Architecture Blank tools
  String TOOL_EAB_CREATE_COTS = "cots"; //$NON-NLS-1$
  String TOOL_EAB_CREATE_CS = "cs"; //$NON-NLS-1$
  String TOOL_EAB_CREATE_HW = "hw"; //$NON-NLS-1$
  String TOOL_EAB_CREATE_INTERFACE = "interface"; //$NON-NLS-1$
  String TOOL_EAB_CREATE_NDI = "ndi"; //$NON-NLS-1$
  String TOOL_EAB_CREATE_PRIME_ITEM = "prime.item"; //$NON-NLS-1$
  String TOOL_EAB_CREATE_SYSTEM = "system"; //$NON-NLS-1$
  String TOOL_EAB_MANAGE_REALIZED_PHYSICAL_ARTIFACTS = "manage.realized.physical.artifacts"; //$NON-NLS-1$
  String TOOL_EAB_INSERT_REMOVE_CONFIGURATION_ITEMS = "configuration.items"; //$NON-NLS-1$
  String TOOL_EAB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_EAB_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_EAB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // Unsynchronized tools
  String TOOL_EAB_INSERT_REMOVE_REALIZED_PHYSICAL_ARTIFACTS = "realized.physical.artifacts"; //$NON-NLS-1$
  // multi parts tool
  String TOOL_EAB_REUSE_CONFIGURATION_ITEM = "reuse.configuration.item"; //$NON-NLS-1$

  String TOOL_EAB_SHOW_HIDE_CONFIGURATION_ITEMS = Messages.IToolNameConstants_318;
  String TOOL_EAB_SHOW_HIDE_REALIZED_PHYSICAL_ARTIFACTS = Messages.IToolNameConstants_319;
  String TOOL_EAB_SHOW_HIDE_CONSTRAINTS = Messages.IToolNameConstants_320;

  // ES Tools - Exchange Scenario
  String TOOL_ES_CREATE_NODE_PC = TOOL_CREATE_NODE_COMPONENT;
  String TOOL_ES_CREATE_BEHAVIOR_PC = TOOL_CREATE_BEHAVIOR_COMPONENT;
  String TOOL_ES_CREATE_COMPONENT = TOOL_CREATE_COMPONENT;
  String TOOL_ES_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_ES_INSERT_REMOVE_COMPONENTS = TOOL_INSERT_REMOVE_COMPONENTS;
  String TOOL_ES_INSERT_ACTOR = TOOL_INSERT_REMOVE_ACTORS;
  String TOOL_ES_CREATE_FUNCTIONAL_EXCHANGE_WITH_RETURN_BRANCH = TOOL_CREATE_FUNCTIONAL_EXCHANGE_WITH_RETURN_BRANCH;
  String TOOL_ES_CREATE_FUNCTIONAL_EXCHANGE = TOOL_CREATE_FUNCTIONAL_EXCHANGE;
  String TOOL_ES_CREATE_FOUND_FUNCTIONAL_EXCHANGE = TOOL_CREATE_FOUND_FUNCTIONAL_EXCHANGE;
  String TOOL_ES_INSERT_REMOVE_FUNCTION = "allocated.function"; //$NON-NLS-1$
  String TOOL_ES_INSERT_REMOVE_STATE_MODE = "state.mode"; //$NON-NLS-1$
  String TOOL_ES_CREATE_REFERENCE = TOOL_CREATE_REFERENCE;
  String TOOL_ES_CREATE_LOOP = TOOL_CREATE_LOOP;
  String TOOL_ES_CREATE_ALT = TOOL_CREATE_ALT;
  String TOOL_ES_CREATE_PAR = TOOL_CREATE_PAR;
  String TOOL_ES_CREATE_OTHER_COMBINED_FRAGMENT = TOOL_CREATE_OTHER_COMBINED_FRAGMENT;
  String TOOL_ES_CREATE_OPERAND = TOOL_CREATE_OPERAND;
  String TOOL_ES_CREATE_COMPONENT_EXCHANGE_WITH_RETURN_BRANCH = TOOL_CREATE_COMPONENT_EXCHANGE_WITH_RETURN_BRANCH;
  String TOOL_ES_CREATE_COMPONENT_EXCHANGE = TOOL_CREATE_COMPONENT_EXCHANGE;
  String TOOL_ES_LOST_COMPONENT_EXCHANGE = TOOL_LOST_COMPONENT_EXCHANGE;
  String TOOL_ES_FOUND_COMPONENT_EXCHANGE = TOOL_FOUND_COMPONENT_EXCHANGE;
  String TOOL_ES_LOST_FUNCTIONAL_EXCHANGE = TOOL_LOST_FUNCTIONAL_EXCHANGE;
  String TOOL_ES_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_ES_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_ES_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_ES_CREATE_ARM_TIMER = TOOL_CREATE_ARM_TIMER;
  String TOOL_ES_CREATE_CANCEL_TIMER = TOOL_CREATE_CANCEL_TIMER;
  String TOOL_ES_DURATION = TOOL_DURATION;
  String TOOL_ES_EXCHANGE_CONTEXT = TOOL_EXCHANGE_CONTEXT;

  // id tools
  String TOOL_ES_CREATE_CONSTRAINTELEMENTSCENARIO = "constraint.element.scenario"; //$NON-NLS-1$
  String TOOL_ES_CREATE_FUNCTION_STATE = Messages.IToolNameConstants_328;
  String TOOL_ES_CREATE_STATE_MODE = TOOL_INSERT_REMOVE_STATE_MODE;

  // FCD tools - Functional Chain Description
  String TOOL_FCD_INVOLVE_FUNCTION = "involve.function"; //$NON-NLS-1$
  String TOOL_FCD_INVOLVE_EXCHANGE = "involve.exchange"; //$NON-NLS-1$
  String TOOL_FCD_INVOLVE_EXCHANGE_AND_FUNCTION = "involve.exchange.and.function"; //$NON-NLS-1$
  String TOOL_FCD_INVOLVE_FUNCTIONAL_CHAIN = "involve.functional.chain"; //$NON-NLS-1$
  String TOOL_FCD_CONNECT_FUNCTIONS = "connect.functions"; //$NON-NLS-1$

  String TOOL_FCD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_FCD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_FCD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // Accelerators
  String TOOL_FCD_INITIALIZATION_FROM_EXISTING_DIAGRAM = "Initialization from existing diagram"; //$NON-NLS-1$

  /*
   * Sequencing section
   */
  // Control Node Tools
  String TOOL_CREATE_CONTROL_NODE_AND = "and"; //$NON-NLS-1$
  String TOOL_CREATE_CONTROL_NODE_OR = "or"; //$NON-NLS-1$
  String TOOL_CREATE_CONTROL_NODE_IT = "it"; //$NON-NLS-1$

  String TOOL_CREATE_CONSTRUCT_CONTROL_NODE_AND = "and.construct"; //$NON-NLS-1$
  String TOOL_CREATE_CONSTRUCT_CONTROL_NODE_OR = "or.construct"; //$NON-NLS-1$
  String TOOL_CREATE_CONSTRUCT_CONTROL_NODE_IT = "it.construct"; //$NON-NLS-1$

  String TOOL_CREATE_SEQUENCE_LINK = "sequence.link"; //$NON-NLS-1$
  String TOOL_CREATE_FUNCTION_ON_SEQUENCE_LINK = "involve.function.on.sequence.link"; //$NON-NLS-1$
  String TOOL_CREATE_EXCHANGE_WITH_SEQUENCE_LINK = "involve.exchange.with.sequence.link"; //$NON-NLS-1$
  String TOOL_ASSOCIATE_SEQUENCE_LINK_WITH_EXCHANGE = "associate.sequence.link.with.exchange"; //$NON-NLS-1$
  String TOOL_EXCHANGE_FROM_SEQUENCE_LINK = "involve.exchange.from.sequence.link"; //$NON-NLS-1$
  String TOOL_SEQUENCE_LINK_FROM_EXCHANGE = "sequence.link.from.exchange"; //$NON-NLS-1$

  // FS tools - Function Scenario
  String TOOL_FS_CREATE_SYSTEM_FUNCTION = TOOL_CREATE_FUNCTION;
  String TOOL_FS_CREATE_LOGICAL_FUNCTION = TOOL_CREATE_FUNCTION;
  String TOOL_FS_CREATE_PHYSICAL_FUNCTION = TOOL_CREATE_FUNCTION;
  String TOOL_FS_CREATE_DUPLICATE = TOOL_CREATE_FUNCTION_DUPLICATE;
  String TOOL_FS_CREATE_GATHER = TOOL_CREATE_FUNCTION_GATHER;
  String TOOL_FS_CREATE_ROUTE = TOOL_CREATE_FUNCTION_ROUTE;
  String TOOL_FS_CREATE_SELECT = TOOL_CREATE_FUNCTION_SELECT;
  String TOOL_FS_CREATE_SPLIT = TOOL_CREATE_FUNCTION_SPLIT;
  String TOOL_FS_INSERT_REMOVE_FUNCTIONS = "functions"; //$NON-NLS-1$
  String TOOL_FS_CREATE_FUNCTIONAL_EXCHANGE_WITH_RETURN_BRANCH = TOOL_CREATE_FUNCTIONAL_EXCHANGE_WITH_RETURN_BRANCH;
  String TOOL_FS_CREATE_FUNCTIONAL_EXCHANGE = "functional.exchange"; //$NON-NLS-1$
  String TOOL_FS_CREATE_REFERENCE = TOOL_CREATE_REFERENCE;
  String TOOL_FS_CREATE_LOOP = TOOL_CREATE_LOOP;
  String TOOL_FS_CREATE_ALT = TOOL_CREATE_ALT;
  String TOOL_FS_CREATE_PAR = TOOL_CREATE_PAR;
  String TOOL_FS_CREATE_OTHER_COMBINED_FRAGMENT = TOOL_CREATE_OTHER_COMBINED_FRAGMENT;
  String TOOL_FS_CREATE_OPERAND = TOOL_CREATE_OPERAND;
  String TOOL_FS_INSERT_REMOVE_STATE_MODE = "state.mode"; //$NON-NLS-1$
  String TOOL_FS_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_FS_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_FS_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_FS_DURATION = TOOL_DURATION;
  String TOOL_FS_EXCHANGE_CONTEXT = TOOL_EXCHANGE_CONTEXT;

  // ID tool
  String TOOL_FS_CREATE_CONSTRAINTELEMENTSCENARIO = "constraint.element.scenario"; //$NON-NLS-1$
  String TOOL_FS_CREATE_STATE_MODE = TOOL_INSERT_REMOVE_STATE_MODE;

  // ID tools - Interface Diagram
  String TOOL_ID_CREATE_EVENT = "event"; //$NON-NLS-1$
  String TOOL_ID_CREATE_OPERATION = "operation"; //$NON-NLS-1$
  String TOOL_ID_CREATE_FLOW = "flow"; //$NON-NLS-1$
  String TOOL_ID_CREATE_DATA = "data"; //$NON-NLS-1$
  String TOOL_ID_CREATE_UNDEFINED_EXCHANGE_ITEM = "undefined.exchange.item"; //$NON-NLS-1$
  String TOOL_ID_CREATE_EXCHANGEITEMELEMENT = "exchange.item.element"; //$NON-NLS-1$
  String TOOL_ID_INSERT_REMOVE_EXCHANGE_ITEM_ALLOCATIONS = "exchange.item.allocations"; //$NON-NLS-1$
  String TOOL_ID_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_ID_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_ID_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // IDB tools - Interfaces Diagram Blank
  String TOOL_IDB_CREATE_COMPONENT = "component"; //$NON-NLS-1$
  String TOOL_IDB_REUSE_COMPONENT = "reuse.component"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_IN_FLOW_PORT = "in.flow.port"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_OUT_FLOW_PORT = "out.flow.port"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_INOUT_FLOW_PORT = "in.out.flow.port"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_STANDARD_PORT = "standard.port"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_INTERFACE = "interface"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_IMPLEMENTS = "implements"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_USES = "uses"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_PROVIDES = "provides"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_REQUIRES = "requires"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_DELEGATION = "delegation"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_GENERALIZATION = "generalization"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_EVENT = "event"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_OPERATION = "operation"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_FLOW = "flow"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_DATA = "data"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_UNDEFINED_EXCHANGE_ITEM = "undefined.exchange.item"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_EXCHANGE_ITEM_ELEMENT = "exchange.item.element"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_TRANSMIT = "transmit"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_ACQUIRE = "acquire"; //$NON-NLS-1$
  String TOOL_IDB_MANAGE_EXCHANGE_ITEM_ALLOCATIONS = "manage.exchange.item.allocations"; //$NON-NLS-1$
  String TOOL_IDB_INSERT_REMOVE_COMPONENTS = "components"; //$NON-NLS-1$
  String TOOL_IDB_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_IDB_INSERT_REMOVE_INTERFACES = "interfaces"; //$NON-NLS-1$
  String TOOL_IDB_INSERT_REMOVE_RELATIONSHIPS = "relationships"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_IDB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  String TOOL_IDB_INSERT_REMOVE_COMPONENTS__LABEL = "components"; //$NON-NLS-1$
  String TOOL_IDB_INSERT_REMOVE_RELATIONSHIPS__LABEL = "relationships"; //$NON-NLS-1$

  // Accelerators
  String TOOL_IDB_INITIALIZATION_FROM_EXISTING_DIAGRAM = "initialization.from.existing.diagram"; //$NON-NLS-1$
  // Unsynchronized tools
  String TOOL_IDB_INSERT_REMOVE_COMPONENT_PORTS = "component.ports"; //$NON-NLS-1$
  String TOOL_IDB_INSERT_REMOVE_EXCHANGE_ITEM_ALLOCATIONS = "exchange.item.allocations"; //$NON-NLS-1$
  String TOOL_IDB_INSERT_REMOVE_EXCHANGE_ITEM = "exchange.items"; //$NON-NLS-1$
  String TOOL_IDB_INSERT_REMOVE_EXCHANGE_ITEM_ELEMENTS = "exchange.item.elements"; //$NON-NLS-1$
  String TOOL_IDB_INSERT_REMOVE_COMMUNICATION_LINKS = Messages.IToolNameConstants_404;

  // tools id
  String TOOL_IDB_SHOW_HIDE_ACTORS = Messages.IToolNameConstants_405;
  String TOOL_IDB_SHOW_HIDE_INTERFACES = Messages.IToolNameConstants_406;
  String TOOL_IDB_SHOW_HIDE_EXCHANGE_ITEMS = Messages.IToolNameConstants_407;
  String TOOL_IDB_SHOW_HIDE_COMPONENT_PORTS = Messages.IToolNameConstants_408;
  String TOOL_IDB_SHOW_HIDE_RELATIONSHIPS = Messages.IToolNameConstants_409;
  String TOOL_IDB_SHOW_HIDE_COMMUNICATIONSLINKS = Messages.IToolNameConstants_410;
  String TOOL_IDB_SHOW_HIDE_EXCHANGE_ITEM_ALLOCATIONS = Messages.IToolNameConstants_411;
  String TOOL_IDB_SHOW_HIDE_EXCHANGE_ITEM_ELEMENTS = Messages.IToolNameConstants_412;
  String TOOL_IDB_CREATE_COMMUNICATIONLINK_TRANSMIT = "transmit"; //$NON-NLS-1$
  String TOOL_IDB_CREATE_COMMUNICATIONLINK_ACQUIRE = "acquire"; //$NON-NLS-1$
  String TOOL_IDB_RECONNECT_IMPLEMENTS_TARGET = "implements target"; //$NON-NLS-1$
  String TOOL_IDB_RECONNECT_USES_TARGET = "uses target"; //$NON-NLS-1$
  String TOOL_IDB_RECONNECT_PINPROVIDED_SOURCE = "implements-pinprovided source"; //$NON-NLS-1$
  String TOOL_IDB_RECONNECT_PINPROVIDEDINTERFACE_TARGET = "PinProvidedInterface target"; //$NON-NLS-1$
  String TOOL_IDB_RECONNECT_PINREQUIRED_SOURCE = "used-pinrequired source"; //$NON-NLS-1$
  String TOOL_IDB_RECONNECT_PINREQUIREDINTERFACE_TARGET = "PinRequiredInterface target"; //$NON-NLS-1$
  String TOOL_IDB_RECONNECT_GENERALIZATION_SOURCE = Messages.IToolNameConstants_421;
  String TOOL_IDB_RECONNECT_GENERALIZATION_TARGET = Messages.IToolNameConstants_422;
  String TOOL_IDB_RECONNECT_COMMUNICATIONLINK_SOURCE = "CommunicationLink source"; //$NON-NLS-1$
  String TOOL_IDB_RECONNECT_COMMUNICATIONLINK_TARGET = "CommunicationLink target"; //$NON-NLS-1$

  // Interface Scenario Diagram Tools
  String TOOL_IS_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_IS_CREATE_COMPONENT = "component"; //$NON-NLS-1$
  String TOOL_IS_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_IS_CREATE_MESSAGE = TOOL_CREATE_MESSAGE;
  String TOOL_IS_DELETE_MESSAGE = TOOL_DELETE_MESSAGE;
  String TOOL_IS_FOUND_MESSAGE = "found.message"; //$NON-NLS-1$
  String TOOL_IS_LOST_MESSAGE = "lost.message"; //$NON-NLS-1$
  String TOOL_IS_SYNCHRONOUS_MESSAGE = "sequence.message.with.return.branch"; //$NON-NLS-1$
  String TOOL_IS_ASYNCHRONOUS_MESSAGE = "sequence.message"; //$NON-NLS-1$
  String TOOL_IS_INSERT_REMOVE_SHARED_DATA_EVENT = "shared.data.event"; //$NON-NLS-1$
  String TOOL_IS_INSERT_REMOVE_STATE_MODE = "state.mode"; //$NON-NLS-1$
  String TOOL_IS_CREATE_REFERENCE = TOOL_CREATE_REFERENCE;
  String TOOL_IS_CREATE_LOOP = TOOL_CREATE_LOOP;
  String TOOL_IS_CREATE_ALT = TOOL_CREATE_ALT;
  String TOOL_IS_CREATE_PAR = TOOL_CREATE_PAR;
  String TOOL_IS_CREATE_OTHER_COMBINED_FRAGMENT = TOOL_CREATE_OTHER_COMBINED_FRAGMENT;
  String TOOL_IS_CREATE_OPERAND = TOOL_CREATE_OPERAND;
  String TOOL_IS_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_IS_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_IS_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_IS_CREATE_COTS = "cots"; //$NON-NLS-1$
  String TOOL_IS_CREATE_CS = "cs"; //$NON-NLS-1$
  String TOOL_IS_CREATE_HW = "hw"; //$NON-NLS-1$
  String TOOL_IS_CREATE_INTERFACE = "interface"; //$NON-NLS-1$
  String TOOL_IS_CREATE_NDI = "ndi"; //$NON-NLS-1$
  String TOOL_IS_CREATE_PRIME_ITEM = "prime.item"; //$NON-NLS-1$
  String TOOL_IS_CREATE_SYSTEM = "system"; //$NON-NLS-1$
  String TOOL_IS_INSERT_REMOVE_COMPONENTS = TOOL_INSERT_REMOVE_COMPONENTS;
  String TOOL_IS_INSERT_REMOVE_FUNCTION = "allocated.function"; //$NON-NLS-1$
  String TOOL_IS_CREATE_ARM_TIMER = TOOL_CREATE_ARM_TIMER;
  String TOOL_IS_CREATE_CANCEL_TIMER = TOOL_CREATE_CANCEL_TIMER;
  String TOOL_IS_DURATION = TOOL_DURATION;
  String TOOL_IS_EXCHANGE_CONTEXT = TOOL_EXCHANGE_CONTEXT;
  String TOOL_IS_EI_EXCHANGE_CONTEXT = TOOL_EXCHANGE_CONTEXT;
  String TOOL_IS_RECONNECT_CONSTRAINT = Messages.IToolNameConstants_445;
  String TOOL_ES_RECONNECT_CONSTRAINT = Messages.IToolNameConstants_446;
  String TOOL_FS_RECONNECT_CONSTRAINT = Messages.IToolNameConstants_447;
  
  String TOOL_OES_RECONNECT_CONSTRAINT = Messages.IToolNameConstants_448;
  String TOOL_OAS_RECONNECT_CONSTRAINT = Messages.IToolNameConstants_449;
  

  // id tools
  String TOOL_IS_CREATE_CONSTRAINTELEMENTSCENARIO = "constraint.element.scenario"; //$NON-NLS-1$
  String TOOL_IS_CREATE_STATE_MODE = TOOL_INSERT_REMOVE_STATE_MODE;

  // LAB tools
  // Components
  String TOOL_LAB_CREATE_COMPONENT = "logical.component"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_LOGICAL_ACTOR = "logical.actor"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_IN_FLOW_PORT_PORT = "in.flow.port"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_OUT_FLOW_PORT_PORT = "out.flow.port"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_INOUT_FLOW_PORT_PORT = "in.out.flow.port"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_STANDARD_PORT_PORT = "standard.port"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_COMPONENT_EXCHANGE = TOOL_CREATE_COMPONENT_EXCHANGE;
  String TOOL_LAB_CREATE_COMPONENT_EXCHANGE_WITH_DELEGATIONS = "component.exchange.with.delegations"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_DELEGATION = "delegation"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_PHYSICAL_LINK = "physical.link"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_PHYSICAL_PORT = "physical.port"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_COMPONENTS = "components"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_PHYSICAL_LINKS = "physical.links"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_PHYSICAL_PATH = "physical.path"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_COMPONENT_EXCHANGES = "component.exchanges"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_PHYSICAL_LINKS_CATEGORIES = "switch.physical.links.categories"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_ACTOR = Messages.IToolNameConstants_470;
  // Functions
  String TOOL_LAB_CREATE_LOGICAL_FUNCTION = "logical.function"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_SELECT = "select"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_INPUT_PORT = "input.port"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_OUTPUT_PORT = "output.port"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_PORT_ALLOCATION = "port.allocation"; //$NON-NLS-1$
  String TOOL_LAB_MANAGE_FUNCTION_ALLOCATION = "manage.function.allocation"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_ALLOCATED_FUNCTIONS = "allocated.functions"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_ALL_ALLOCATED_FUNCTIONS = "all.allocated.functions"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_FUNCTIONAL_CHAINS = "functional.chains"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_FUNCTIONAL_EXCHANGES = "functional.exchanges"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_EXCHANGE_CATEGORIES = "switch.functional.exchanges.categories"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_SCENARIO_ELEMENTS = Messages.IToolNameConstants_486;
  String TOOL_LAB_INSERT_STATEMODE_ELEMENTS = Messages.IToolNameConstants_487;

  String TOOL_LAB_INSERT_FUNCTIONS_FROM_MODE_STATE = Messages.IToolNameConstants_488;
  String TOOL_LAB_INSERT_ELEMENTS_FROM_SCENARIO = Messages.IToolNameConstants_489;
  String TOOL_LAB_STATE_MODE_ELEMENTS_ID = Messages.IToolNameConstants_490;
  String TOOL_LAB_SCENARIO_ELEMENTS_ID = Messages.IToolNameConstants_491;
  String TOOL_LAB_INSERT_REMOVE_CATEGORIES = "categories"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_COMPONENT_EXCHANGES_CATEGORIES = "switch.component.exchanges.categories"; //$NON-NLS-1$
  // Accelerators
  String TOOL_LAB_INITIALIZATION_FROM_EXISTING_DIAGRAM = "initialization.from.existing.diagram"; //$NON-NLS-1$
  // Unsynchronized tools
  String TOOL_LAB_INSERT_REMOVE_FUNCTION_PORTS = "function.ports"; //$NON-NLS-1$
  String TOOL_LAB_INSERT_REMOVE_PORTS = "ports"; //$NON-NLS-1$
  // Multi parts tools
  String TOOL_LAB_REUSE_LOGICAL_COMPONENT = "reuse.logical.component"; //$NON-NLS-1$
  String TOOL_LAB_REUSE_LOGICAL_ACTOR = "reuse.logical.actor"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_COMPONENT_EXCHANGE_WITH_PORTS = "component.exchange.with.ports"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_COMPONENT_EXCHANGE_WITHOU_PORTS = "component.exchange.without.ports"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_COMPONENT_EXCHANGE_BETWEEN_TYPES = "component.exchange.between.types"; //$NON-NLS-1$

  // tools id
  String TOOL_LAB_DELETE_ELEMENT = "delete capella element"; //$NON-NLS-1$
  String TOOL_LAB_SHOW_HIDE_COMPONENT_EXCHANGES = Messages.IToolNameConstants_503;
  String TOOL_LAB_SHOW_HIDE_PORTS = Messages.IToolNameConstants_504;
  String TOOL_LAB_SHOW_HIDE_FUNCTION_PORTS = Messages.IToolNameConstants_505;
  String TOOL_LAB_SHOW_HIDE_FUNCTIONAL_EXCHANGES = "functional.exchanges"; //$NON-NLS-1$
  String TOOL_LAB_SHOW_HIDE_FUNCTIONAL_CHAINS = Messages.IToolNameConstants_507;
  String TOOL_LAB_SHOW_HIDE_CONSTRAINTS = Messages.IToolNameConstants_508;
  String TOOL_LAB_CREATE_FUNCTIONAL_CHAIN = "functional.chain"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_CONNECTION_WITH_PORTS = Messages.IToolNameConstants_510;
  String TOOL_LAB_RECONNECT_CONNECTION_SOURCE = Messages.IToolNameConstants_511;
  String TOOL_LAB_RECONNECT_CONNECTION_TARGET = Messages.IToolNameConstants_512;
  String TOOL_LAB_RECONNECT_FUNCTION_EXCHANGE = Messages.IToolNameConstants_513;
  String TOOL_LAB_CREATE_OUTFLOW_PORT = "out.flow.port"; //$NON-NLS-1$
  String TOOL_LAB_CREATE_INFLOW_PORT = "in.flow.port"; //$NON-NLS-1$

  // LCBD tools - Logical Component Breakdown
  String TOOL_LCBD_CREATE_LOGICAL_COMPONENT = "logical.component"; //$NON-NLS-1$
  String TOOL_LCBD_CREATE_LOGICAL_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_LCBD_CONTAINED_IN = "contained.in"; //$NON-NLS-1$
  String TOOL_LCBD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_LCBD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_LCBD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // multi part tool
  String TOOL_LCBD_CREATE_PART = "create.part"; //$NON-NLS-1$

  // LCCDI - Logical Contextual Component Detailed Interfaces tools
  String TOOL_LCCDI_CREATE_ECHANGE_ITEM_EVENT = "event"; //$NON-NLS-1$
  String TOOL_LCCDI_CREATE_ECHANGE_ITEM_OPERATION = "operation"; //$NON-NLS-1$
  String TOOL_LCCDI_CREATE_ECHANGE_ITEM_FLOW = "flow"; //$NON-NLS-1$
  String TOOL_LCCDI_CREATE_ECHANGE_ITEM_DATA = "data"; //$NON-NLS-1$
  String TOOL_LCCDI_CREATE_INTERFACE = "interface"; //$NON-NLS-1$
  String TOOL_LCCDI_CREATE_COMMUNICATION_LINK_TRANSMIT = Messages.IToolNameConstants_528;
  String TOOL_LCCDI_CREATE_COMMUNICATION_LINK_ACQUIRE = Messages.IToolNameConstants_529;
  String TOOL_LCCDI_CREATE_USES = "uses"; //$NON-NLS-1$
  String TOOL_LCCDI_CREATE_PROVIDES = "provides"; //$NON-NLS-1$
  String TOOL_LCCDI_CREATE_REQUIRES = "requires"; //$NON-NLS-1$
  String TOOL_LCCDI_CREATE_GENERALIZATION = "generalization"; //$NON-NLS-1$
  String TOOL_LCCDI_CREATE_STANDARD_PORT = "standard.port"; //$NON-NLS-1$
  String TOOL_LCCDI_CREATE_IMPLEMENTS = "implements"; //$NON-NLS-1$

  // Logical system - Contextual Component External Interfaces (LCCEI) tools
  String TOOL_LCCEI_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_LCCEI_CREATE_ECHANGE_ITEM_EVENT = "event"; //$NON-NLS-1$
  String TOOL_LCCEI_CREATE_ECHANGE_ITEM_OPERATION = "operation"; //$NON-NLS-1$
  String TOOL_LCCEI_CREATE_ECHANGE_ITEM_FLOW = "flow"; //$NON-NLS-1$
  String TOOL_LCCEI_CREATE_ECHANGE_ITEM_DATA = "data"; //$NON-NLS-1$
  String TOOL_LCCEI_CREATE_UNDEFINED_ECHANGE_ITEM = "undefined.exchange.item"; //$NON-NLS-1$
  String TOOL_LCCEI_CREATE_INTERFACE = "interface"; //$NON-NLS-1$
  String TOOL_LCCEI_CREATE_COMMUNICATION_LINK_TRANSMIT = Messages.IToolNameConstants_543;
  String TOOL_LCCEI_CREATE_COMMUNICATION_LINK_ACQUIRE = Messages.IToolNameConstants_544;
  String TOOL_LCCEI_SHOW_HIDE_ACTORS = Messages.IToolNameConstants_545;
  String TOOL_LCCEI_SHOW_HIDE_EXCHANGE_ITEMS = Messages.IToolNameConstants_546;
  String TOOL_LCCEI_CREATE_LOGICAL_COMPONENT = Messages.IToolNameConstants_547;
  String TOOL_LCCEI_CREATE_USES = Messages.IToolNameConstants_548;
  String TOOL_LCCEI_CREATE_PROVIDES = Messages.IToolNameConstants_549;
  String TOOL_LCCEI_CREATE_REQUIRES = Messages.IToolNameConstants_550;
  String TOOL_LCCEI_CREATE_GENERALIZATION = Messages.IToolNameConstants_551;
  String TOOL_LCCEI_CREATE_INOUT_FLOW_PORT_PORT = Messages.IToolNameConstants_552;
  String TOOL_LCCEI_CREATE_STANDARD_PORT = Messages.IToolNameConstants_553;
  String TOOL_LCCEI_CREATE_PORT_DELEGATION = Messages.IToolNameConstants_554;
  String TOOL_LCCEI_CREATE_IMPLEMENTS = Messages.IToolNameConstants_555;
  String TOOL_LCCEI_CREATE_EXCHANGE_ITEM_ALLOCATION = Messages.IToolNameConstants_556;
  String TOOL_LCCEI_SHOW_HIDE_INTERFACES = Messages.IToolNameConstants_557;

  // LCCII - Logical Contextual Component Internal Interfaces tools
  String TOOL_LCCII_CREATE_LOGICAL_COMPONENT = "component"; //$NON-NLS-1$
  String TOOL_LCCII_REUSE_COMPONENT = "reuse.component"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_IN_FLOW_PORT = "in.flow.port"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_OUT_FLOW_PORT = "out.flow.port"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_INOUT_FLOW_PORT_PORT = "in.out.flow.port"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_STANDARD_PORT = "standard.port"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_INTERFACE = "interface"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_IMPLEMENTS = "implements"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_USES = "uses"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_PROVIDES = "provides"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_REQUIRES = "requires"; //$NON-NLS-1$
  // the following constant is the label of "Port Delegation" tool
  String TOOL_LCCII_CREATE_DELEGATION = "delegation"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_GENERALIZATION = "generalization"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_ECHANGE_ITEM_EVENT = "event"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_ECHANGE_ITEM_OPERATION = "operation"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_ECHANGE_ITEM_FLOW = "flow"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_ECHANGE_ITEM_DATA = "data"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_UNDEFINED_EXCHANGE_ITEM = "undefined.exchange.item"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_EXCHANGE_ITEM_ALLOCATION = "exchange.item.allocation"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_TRANSMIT = "transmit"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_ACQUIRE = "acquire"; //$NON-NLS-1$
  String TOOL_LCCII_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_LCCII_INSERT_REMOVE_COMPONENTS = "components"; //$NON-NLS-1$
  String TOOL_LCCII_INSERT_REMOVE_INTERFACES = "interfaces"; //$NON-NLS-1$
  String TOOL_LCCII_INSERT_REMOVE_EXCHANGE_ITEMS = "exchange.items"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_LCCII_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_LCCII_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // the ID of "Port Delegation" tool
  String TOOL_LCCII_CREATE_PORT_DELEGATION = Messages.IToolNameConstants_586;
  String TOOL_LCCII_CREATE_COMMUNICATION_LINK_TRANSMIT = Messages.IToolNameConstants_587;
  String TOOL_LCCII_CREATE_COMMUNICATION_LINK_ACQUIRE = Messages.IToolNameConstants_588;

  // LDFB tools - Logical Data Flow Blank tools
  String TOOL_LDFB_CREATE_LOGICAL_FUNCTION = "logical.function"; //$NON-NLS-1$
  String TOOL_LDFB_CREATE_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_LDFB_CREATE_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_LDFB_CREATE_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_LDFB_CREATE_SELECT = "select"; //$NON-NLS-1$
  String TOOL_LDFB_CREATE_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_LDFB_CREATE_INPUT_PORT = "input.port"; //$NON-NLS-1$
  String TOOL_LDFB_CREATE_OUTPUT_PORT = "output.port"; //$NON-NLS-1$
  String TOOL_LDFB_CREATE_FUNCTIONAL_EXCHANGE = "functional.exchange"; //$NON-NLS-1$
  String TOOL_LDFB_INSERT_REMOVE_FUNCTIONS = "functions"; //$NON-NLS-1$
  String TOOL_LDFB_INSERT_REMOVE_FUNCTIONAL_EXCHANGES = "functional.exchanges"; //$NON-NLS-1$
  String TOOL_LDFB_INSERT_REMOVE_FUNCTIONAL_CHAINS = "functional.chains"; //$NON-NLS-1$
  String TOOL_LDFB_INSERT_REMOVE_FUNCTIONAL_CHAIN_ELEMENTS = "functional.chain.elements"; //$NON-NLS-1$
  String TOOL_LDFB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_LDFB_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_LDFB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // Accelerators
  String TOOL_LDFB_INITIALIZATION_FROM_EXISTING_DIAGRAM = "initialization.from.existing.diagram"; //$NON-NLS-1$
  // unsynchronized tools
  String TOOL_LDFB_INSERT_REMOVE_FUNCTION_PORTS = "function.ports"; //$NON-NLS-1$
  String TOOL_LDFB_INSERT_REMOVE_EXCHANGE_CATEGORIES = "exchange.categories"; //$NON-NLS-1$
  // other tools and id tool
  String TOOL_LDFB_CREATE_FUNCTIONAL_CHAIN = "functional.chain"; //$NON-NLS-1$
  String TOOL_LDFB_SHOW_HIDE_FUNCTIONAL_CHAIN = Messages.IToolNameConstants_609;
  String TOOL_LDFB_SHOW_HIDE_FUNCTIONAL_EXCH_CATEGORIES = "switch.functional.exchanges.categories"; //$NON-NLS-1$
  String TOOL_LDFB_SHOW_HIDE_EXCH_CATEGORIES = Messages.IToolNameConstants_611;
  String TOOL_LDFB_SHOW_HIDE_FUNCTIONS = Messages.IToolNameConstants_612;
  String TOOL_LDFB_SHOW_HIDE_FUNCTIONAL_EXCHANGES = Messages.IToolNameConstants_613;
  String TOOL_LDFB_SHOW_HIDE_FUNCTION_PORTS = Messages.IToolNameConstants_614;
  String TOOL_LDFB_SHOW_HIDE_FUNCTIONAL_EXCHANGE = Messages.IToolNameConstants_615;
  String TOOL_LDFB_SHOW_HIDE_FUNCTION_PORT = Messages.IToolNameConstants_616;
  String TOOL_LDFB_DELETE_ELEMENT = "delete capella element"; //$NON-NLS-1$
  String TOOL_LDFB_SHOW_HIDE_FUNCTION = Messages.IToolNameConstants_618;
  String TOOL_LDFB_INSERT_SCENARIO_ELEMENTS = TOOL_LAB_INSERT_SCENARIO_ELEMENTS;
  String TOOL_LDFB_INSERT_STATEMODE_ELEMENTS = TOOL_LAB_INSERT_STATEMODE_ELEMENTS;
  String TOOL_LDFB_RECONNECT_EXCHANGE = Messages.IToolNameConstants_619;

  String TOOL_LDFB_INSERT_FUNCTIONS_FROM_MODE_STATE = "functions.from.mode.state"; //$NON-NLS-1$
  String TOOL_LDFB_INSERT_ELEMENTS_FROM_SCENARIO = "elements.from.scenario"; //$NON-NLS-1$
  String TOOL_LDFB_STATE_MODE_ELEMENTS_ID = Messages.IToolNameConstants_622;
  String TOOL_LDFB_SCENARIO_ELEMENTS_ID = Messages.IToolNameConstants_623;

  // LFBD tools - Logical Function Breakdown
  String TOOL_LFBD_CREATE_LOGICAL_FUNCTION = "logical.function"; //$NON-NLS-1$
  String TOOL_LFBD_CREATE_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_LFBD_CREATE_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_LFBD_CREATE_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_LFBD_CREATE_SELECT = "select"; //$NON-NLS-1$
  String TOOL_LFBD_CREATE_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_LFBD_CONTAINED_IN = "contained.in"; //$NON-NLS-1$
  String TOOL_LFBD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_LFBD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_LFBD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // Logical (la layer) Interface Diagram Blank (LIDB) tools
  String TOOL_LIDB_SHOW_HIDE_COMPONENTS = Messages.IToolNameConstants_634;
  String TOOL_LIDB_CREATE_LOGICAL_COMPONENT = Messages.IToolNameConstants_635;
  String TOOL_LIDB_CREATE_ACTOR = Messages.IToolNameConstants_636;
  String TOOL_LIDB_CREATE_ECHANGE_ITEM_EVENT = Messages.IToolNameConstants_637;
  String TOOL_LIDB_CREATE_ECHANGE_ITEM_OPERATION = Messages.IToolNameConstants_638;
  String TOOL_LIDB_CREATE_ECHANGE_ITEM_FLOW = Messages.IToolNameConstants_639;
  String TOOL_LIDB_CREATE_ECHANGE_ITEM_DATA = Messages.IToolNameConstants_640;
  String TOOL_LIDB_CREATE_EXCHANGE_ITEM_ELEMENT = Messages.IToolNameConstants_641;
  String TOOL_LIDB_CREATE_INTERFACE = Messages.IToolNameConstants_642;
  String TOOL_LIDB_MANAGE_EXCHANGE_ITEM_ALLOCATIONS = Messages.IToolNameConstants_643;
  String TOOL_LIDB_CREATE_COMMUNICATION_LINK_TRANSMIT = Messages.IToolNameConstants_644;
  String TOOL_LIDB_CREATE_COMMUNICATION_LINK_ACQUIRE = Messages.IToolNameConstants_645;
  String TOOL_LIDB_CREATE_USES = Messages.IToolNameConstants_646;
  String TOOL_LIDB_CREATE_PROVIDES = Messages.IToolNameConstants_647;
  String TOOL_LIDB_CREATE_REQUIRES = Messages.IToolNameConstants_648;
  String TOOL_LIDB_CREATE_GENERALIZATION = Messages.IToolNameConstants_649;
  String TOOL_LIDB_CREATE_INOUT_FLOW_PORT_PORT = Messages.IToolNameConstants_650;
  String TOOL_LIDB_CREATE_STANDARD_PORT = Messages.IToolNameConstants_651;
  String TOOL_LIDB_CREATE_PORT_DELEGATION = Messages.IToolNameConstants_652;
  String TOOL_LIDB_CREATE_IMPLEMENTS = Messages.IToolNameConstants_653;
  String TOOL_LIDB_CREATE_EXCHANGE_ITEM_ALLOCATION = Messages.IToolNameConstants_654;

  // MB tools - Missions Blank
  String TOOL_MB_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_MB_CREATE_CAPABILITY = "capability"; //$NON-NLS-1$
  String TOOL_MB_CREATE_MISSION = "mission"; //$NON-NLS-1$
  String TOOL_MB_CREATE_CAPABILITY_EXPLOITATION = "capability.exploitation"; //$NON-NLS-1$
  String TOOL_MB_CREATE_ACTOR_INVOLVEMENT = "actor.involvement"; //$NON-NLS-1$
  String TOOL_MB_CREATE_ACTOR_GENERALIZATION = "actor.generalization"; //$NON-NLS-1$
  String TOOL_MB_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_MB_INSERT_REMOVE_CAPABILITIES = "capabilities"; //$NON-NLS-1$
  String TOOL_MB_INSERT_REMOVE_MISSIONS = "missions"; //$NON-NLS-1$
  String TOOL_MB_INSERT_REMOVE_RELATIONSHIPS = "relationships"; //$NON-NLS-1$
  String TOOL_MB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_MB_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_MB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_MB_RECONNECT_GENERALIZATION_SOURCE = TOOL_CC_RECONNECT_GENERALIZATION_SOURCE;
  String TOOL_MB_RECONNECT_GENERALIZATION_TARGET = TOOL_CC_RECONNECT_GENERALIZATION_TARGET;
  // tool id
  String TOOL_MB_SHOW_ACTOR = Messages.IToolNameConstants_668;
  String TOOL_MB_SHOW_MISSION = Messages.IToolNameConstants_669;
  String TOOL_MB_SHOW_CAPABILITY = Messages.IToolNameConstants_670;

  // MCB tools - Mission Capabilities Blank
  String TOOL_MCB_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_MCB_CREATE_MISSION = "mission"; //$NON-NLS-1$
  String TOOL_MCB_CREATE_CAPABILITY = "capability"; //$NON-NLS-1$
  String TOOL_MCB_CREATE_CAPABILITY_EXPLOITATION = "capability.exploitation"; //$NON-NLS-1$
  String TOOL_MCB_CREATE_INVOLVED_ACTOR = "involved.actor"; //$NON-NLS-1$
  String TOOL_MCB_CREATE_EXTENDS = "extends"; //$NON-NLS-1$
  String TOOL_MCB_CREATE_INCLUDES = "includes"; //$NON-NLS-1$
  String TOOL_MCB_CREATE_ACTOR_GENERALIZATION = "actor.generalization"; //$NON-NLS-1$
  String TOOL_MCB_CREATE_CAPABILITY_GENERALIZATION = TOOL_MCB_CREATE_ACTOR_GENERALIZATION;
  String TOOL_MCB_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_MCB_INSERT_REMOVE_ACTORS_LABEL = "actors"; //$NON-NLS-1$
  String TOOL_MCB_INSERT_REMOVE_MISSIONS = "missions"; //$NON-NLS-1$
  String TOOL_MCB_INSERT_REMOVE_MISSIONS_LABEL = "missions"; //$NON-NLS-1$
  String TOOL_MCB_INSERT_REMOVE_CAPABILITIES = "capabilities"; //$NON-NLS-1$
  String TOOL_MCB_INSERT_REMOVE_CAPABILITIES_LABEL = "capabilities"; //$NON-NLS-1$
  String TOOL_MCB_INSERT_REMOVE_RELATIONSHIPS = "relationships"; //$NON-NLS-1$
  String TOOL_MCB_INSERT_REMOVE_RELATIONSHIPS_LABEL = "relationships"; //$NON-NLS-1$
  String TOOL_MCB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_MCB_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_MCB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_MCB_RECONNECT_GENERALIZATION_SOURCE = TOOL_CC_RECONNECT_GENERALIZATION_SOURCE;
  String TOOL_MCB_RECONNECT_GENERALIZATION_TARGET = TOOL_CC_RECONNECT_GENERALIZATION_TARGET;

  // M&S fools - Modes and States
  String TOOL_MS_CREATE_MODE = Messages.IToolNameConstants_690;
  String TOOL_MS_CREATE_STATE = Messages.IToolNameConstants_691;
  String TOOL_MS_REUSE_MODE_STATE = Messages.IToolNameConstants_692;
  String TOOL_MS_CREATE_INITIAL = Messages.IToolNameConstants_693;
  String TOOL_MS_CREATE_JOIN = Messages.IToolNameConstants_694;
  String TOOL_MS_CREATE_CHOICE = Messages.IToolNameConstants_695;
  String TOOL_MS_CREATE_FORK = Messages.IToolNameConstants_696;
  String TOOL_MS_CREATE_TERMINATE = Messages.IToolNameConstants_697;
  String TOOL_MS_CREATE_FINAL = Messages.IToolNameConstants_698;
  String TOOL_MS_CREATE_DEEP_HISTORY = Messages.IToolNameConstants_699;
  String TOOL_MS_CREATE_SHALLOW_HISTORY = Messages.IToolNameConstants_700;
  String TOOL_MS_CREATE_ENTRY_POINT = Messages.IToolNameConstants_701;
  String TOOL_MS_CREATE_EXIT_POINT = Messages.IToolNameConstants_702;
  String TOOL_MS_CREATE_TRANSISTION = Messages.IToolNameConstants_703;
  String TOOL_MS_CREATE_CONSTRAINT = Messages.IToolNameConstants_704;
  String TOOL_MS_CREATE_CONSTRAINTELEMENT = Messages.IToolNameConstants_705;
  String TOOL_MS_INSERT_REMOVE_CONSTRAINTS = Messages.IToolNameConstants_706;
  // Unsynchronized
  String TOOL_MS_INSERT_REMOVE_MODE_STATE = Messages.IToolNameConstants_707;
  String TOOL_MS_INSERT_REMOVE_TRANSITION = Messages.IToolNameConstants_708;

  // Accelerators
  String TOOL_MS_INITIALIZATION_FROM_EXISTING_DIAGRAM = Messages.IToolNameConstants_709;
  // tools id
  String TOOL_MS_INSERT_MODE_STATE = Messages.IToolNameConstants_710;
  String TOOL_MS_SHOW_HIDE_MODE_STATE = Messages.IToolNameConstants_711;
  String TOOL_MS_SHOW_HIDE_TRANSITION = Messages.IToolNameConstants_712;
  String TOOL_MS_RECONNECT_TARGET_TRANSISTION = Messages.IToolNameConstants_713;
  String TOOL_MS_RECONNECT_SOURCE_TRANSISTION = Messages.IToolNameConstants_714;
  String TOOL_MS_DND_STATES_DROM_DIAGRAM = Messages.IToolNameConstants_715;
  String TOOL_MS_DND_PSEUDOSTATES_DROM_DIAGRAM = Messages.IToolNameConstants_716;

  // M&S fools - Modes and States
  String TOOL_MSM_CREATE_MODE = "mode"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_STATE = "state"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_REGION = "region"; //$NON-NLS-1$
  String TOOL_MSM_REUSE_MODE_STATE = "reuse.mode.state"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_INITIAL = "initial"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_JOIN = "join"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_CHOICE = "choice"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_FORK = "fork"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_TERMINATE = "terminate"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_FINAL = "final"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_DEEP_HISTORY = "deep.history"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_SHALLOW_HISTORY = "shallow.history"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_ENTRY_POINT = "entry.point"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_EXIT_POINT = "exit.point"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_TRANSISTION = "transition"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_MSM_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_MSM_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // Unsynchronized
  String TOOL_MSM_INSERT_REMOVE_MODE_STATE = "state.mode"; //$NON-NLS-1$
  String TOOL_MSM_INSERT_REMOVE_TRANSITION = "transitions"; //$NON-NLS-1$

  // Accelerators
  String TOOL_MSM_INITIALIZATION_FROM_EXISTING_DIAGRAM = "initialization.from.existing.diagram"; //$NON-NLS-1$
  // tools id
  String TOOL_MSM_INSERT_MODE_STATE = Messages.IToolNameConstants_738;
  String TOOL_MSM_SHOW_HIDE_MODE_STATE = Messages.IToolNameConstants_739;
  String TOOL_MSM_SHOW_HIDE_TRANSITION = Messages.IToolNameConstants_740;
  String TOOL_MSM_RECONNECT_TARGET_TRANSISTION = Messages.IToolNameConstants_741;
  String TOOL_MSM_RECONNECT_SOURCE_TRANSISTION = Messages.IToolNameConstants_742;
  String TOOL_MSM_DND_STATES_DROM_DIAGRAM = Messages.IToolNameConstants_743;
  String TOOL_MSM_DND_PSEUDOSTATES_DROM_DIAGRAM = Messages.IToolNameConstants_744;

  // OAB tools - Operational Architecture Blank
  // Entities
  String TOOL_OAB_CREATE_OE = "operational.entity"; //$NON-NLS-1$
  String TOOL_OAB_CREATE_OA = "operational.actor"; //$NON-NLS-1$
  String TOOL_OAB_CREATE_COMMUNICATION_MEAN = "communication.mean"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_REMOVE_OPERATIONAL_ENTITIES = "operational.entities"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_REMOVE_OPERATIONAL_ACTORS = "operational.actors"; //$NON-NLS-1$
  @Deprecated
  String TOOL_OAB_INSERT_REMOVE_COMMUNICATION_MEANS = "communication.means"; //$NON-NLS-1$
  String TOOL_OAB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_OAB_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // Roles
  String TOOL_OAB_CREATE_ROLE = "role"; //$NON-NLS-1$
  String TOOL_OAB_MANAGE_ROLE_ALLOCATION = "manage.role.allocation"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_REMOVE_ALL_ALLOCATED_ROLES = "all.allocated.roles"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_REMOVE_ALLOCATED_ROLES = "allocated.roles"; //$NON-NLS-1$
  // Activities
  String TOOL_OAB_CREATE_OPERATIONAL_ACTIVITY = "operational.activity"; //$NON-NLS-1$
  String TOOL_OAB_MANAGE_ACTIVITY_ALLOCATION = "manage.activity.allocation"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_REMOVE_INTERACTIONS = "interactions"; //$NON-NLS-1$
  String TOOL_OAB_CREATE_OPERATIONAL_PROCESS = Messages.IToolNameConstants_761;
  String TOOL_OAB_INSERT_REMOVE_OPERATIONAL_PROCESSES = "operational.processes"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_REMOVE_ALLOCATED_ACTIVITIES = "allocated.activities"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_REMOVE_ALL_ALLOCATED_ACTIVITIES_IN_ENTITIES = "all.allocated.activities.in.entities"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_REMOVE_ALL_ALLOCATED_ACTIVITIES_IN_ROLES = "all.allocated.activities.in.roles"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_SCENARIO_ELEMENTS = TOOL_LAB_INSERT_SCENARIO_ELEMENTS;
  String TOOL_OAB_INSERT_STATEMODE_ELEMENTS = TOOL_LAB_INSERT_STATEMODE_ELEMENTS;

  String TOOL_OAB_INSERT_ACTIVITIES_FROM_MODE_STATE = "activities.from.mode.state"; //$NON-NLS-1$
  String TOOL_OAB_INSERT_ELEMENTS_FROM_SCENARIO = "elements.from.scenario"; //$NON-NLS-1$
  String TOOL_OAB_STATE_MODE_ELEMENTS_ID = Messages.IToolNameConstants_768;
  String TOOL_OAB_SCENARIO_ELEMENTS_ID = Messages.IToolNameConstants_769;
  // tools id
  String TOOL_OAB_RECONNECT_COMMUNICATION_MEAN_TARGET = Messages.IToolNameConstants_770;
  String TOOL_OAB_RECONNECT_COMMUNICATION_MEAN_SOURCE = Messages.IToolNameConstants_771;
  String TOOL_OAB_RECONNECT_INTERACTION = Messages.IToolNameConstants_772;

  // OABD tools - Operational Activity Breakdown
  String TOOL_OABD_CREATE_OPERATIONAL_ACTIVITY = "operational.activity"; //$NON-NLS-1$
  String TOOL_OABD_CONTAINED_IN = "contained.in"; //$NON-NLS-1$
  String TOOL_OABD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_OABD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_OABD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // OAIB tools - Operational Activity Interaction Blank Diagram
  String TOOL_OAIB_INSERT_REMOVE_OPERATIONAL_ACTIVITIES = "operational.activities"; //$NON-NLS-1$
  String TOOL_OAIB_INSERT_REMOVE_INTERACTIONS = "interactions"; //$NON-NLS-1$
  String TOOL_OAIB_SHOW_HIDE_OP = "operational.processes"; //$NON-NLS-1$
  String TOOL_OAIB_CREATE_OPERATIONAL_PROCESS_ELEMENTS = "operational.process.elements"; //$NON-NLS-1$
  String TOOL_OAIB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_OAIB_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_OAIB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_OAIB_INSERT_SCENARIO_ELEMENTS = TOOL_LDFB_INSERT_SCENARIO_ELEMENTS;
  String TOOL_OAIB_INSERT_STATEMODE_ELEMENTS = TOOL_LDFB_INSERT_STATEMODE_ELEMENTS;

  String TOOL_OAIB_CREATE_OPERATIONAL_PROCESS = "operational.process"; //$NON-NLS-1$
  String TOOL_OAIB_SHOW_HIDE_OA = Messages.IToolNameConstants_786;
  String TOOL_OAIB_SHOW_HIDE_OPERATIONAL_PROCESS = "operational.processes"; //$NON-NLS-1$
  String TOOL_OAIB_SHOW_OPERATIONAL_PROCESS_ELT = Messages.IToolNameConstants_788;
  String TOOL_OAIB_SHOW_HIDE_CONSTRAINTS = Messages.IToolNameConstants_789;
  String TOOL_OAIB_SHOW_HIDE_INTERACTION = Messages.IToolNameConstants_790;
  String TOOL_OAIB_RECONNECT_EXCHANGES = Messages.IToolNameConstants_791;
  String TOOL_OAIB_INSERT_ACTIVITIES_FROM_MODE_STATE = Messages.IToolNameConstants_792;
  String TOOL_OAIB_INSERT_ELEMENTS_FROM_SCENARIO = Messages.IToolNameConstants_793;
  String TOOL_OAIB_STATE_MODE_ELEMENTS_ID = Messages.IToolNameConstants_794;
  String TOOL_OAIB_SCENARIO_ELEMENTS_ID = Messages.IToolNameConstants_795;

  // OAS tools - Operational Activity Scenario
  String TOOL_OAS_CREATE_ACTIVITY = TOOL_CREATE_FUNCTION;
  String TOOL_OAS_CREATE_INTERACTION_WITH_RETURN_BRANCH = TOOL_CREATE_FUNCTIONAL_EXCHANGE_WITH_RETURN_BRANCH;
  String TOOL_OAS_CREATE_INTERACTION = TOOL_CREATE_FUNCTIONAL_EXCHANGE;
  String TOOL_OAS_INSERT_REMOVE_ACTIVITIES = TOOL_INSERT_REMOVE_FUNCTIONS;
  String TOOL_OAS_INSERT_REMOVE_STATE_MODE = TOOL_INSERT_REMOVE_STATE_MODE;
  String TOOL_OAS_CREATE_REFERENCE = TOOL_CREATE_REFERENCE;
  String TOOL_OAS_CREATE_LOOP = TOOL_CREATE_LOOP;
  String TOOL_OAS_CREATE_ALT = TOOL_CREATE_ALT;
  String TOOL_OAS_CREATE_PAR = TOOL_CREATE_PAR;
  String TOOL_OAS_CREATE_OTHER_COMBINED_FRAGMENT = TOOL_CREATE_OTHER_COMBINED_FRAGMENT;
  String TOOL_OAS_CREATE_OPERAND = TOOL_CREATE_OPERAND;
  String TOOL_OAS_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_OAS_CREATE_CONSTRAINTELEMENTSCENARIO = "constraint.element.scenario"; //$NON-NLS-1$
  String TOOL_OAS_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_OAS_DURATION = TOOL_DURATION;
  String TOOL_OAS_EXCHANGE_CONTEXT = TOOL_EXCHANGE_CONTEXT;

  // tool id
  String TOOL_OAS_CREATE_FUNCTIONAL_EXCHANGE_WITH_RETURN_BRANCH = TOOL_CREATE_FUNCTIONAL_EXCHANGE_WITH_RETURN_BRANCH;
  String TOOL_OAS_CREATE_FUNCTIONAL_EXCHANGE = Messages.IToolNameConstants_799;

  // OCB - Operational Capabilities Blank (OCB) tools
  String TOOL_OCB_CREATE_OPERATIONAL_ENTITY = "operational.entity"; //$NON-NLS-1$
  String TOOL_OCB_CREATE_OPERATIONAL_ACTOR = "operational.actor"; //$NON-NLS-1$
  String TOOL_OCB_CREATE_OPERATIONAL_CAPABILITY = "operational.capability"; //$NON-NLS-1$
  String TOOL_OCB_CREATE_COMMUNICATION_MEAN = "communication.mean"; //$NON-NLS-1$
  String TOOL_OCB_CREATE_INVOLMENT = "involvement"; //$NON-NLS-1$
  String TOOL_OCB_CREATE_EXTENDS = "extends"; //$NON-NLS-1$
  String TOOL_OCB_CREATE_INCLUDES = "includes"; //$NON-NLS-1$
  String TOOL_OCB_CREATE_OPERATIONAL_CAPABILITY_GENERALIZATION = "operational.capability.generalization"; //$NON-NLS-1$
  String TOOL_OCB_INSERT_REMOVE_OPERATIONAL_ENTITIES = "operational.entities"; //$NON-NLS-1$
  String TOOL_OCB_INSERT_REMOVE_OPERATIONAL_ACTORS = "operational.actors"; //$NON-NLS-1$
  String TOOL_OCB_INSERT_REMOVE_OPERATIONAL_CAPABILITIES = "operational.capabilities"; //$NON-NLS-1$
  String TOOL_OCB_INSERT_REMOVE_RELATIONSHIPS = "relationships"; //$NON-NLS-1$
  String TOOL_OCB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_OCB_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_OCB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  String TOOL_OCB_SHOW_HIDE_OPERATIONAL_ENTITY = Messages.IToolNameConstants_815;
  String TOOL_OCB_SHOW_HIDE_OPERATIONAL_ACTORS = Messages.IToolNameConstants_816;
  String TOOL_OCB_SHOW_HIDE_CAPABILITIES = Messages.IToolNameConstants_817;

  // Operational Entity Blank Diagram Tools
  // Entities
  String TOOL_OEB_CREATE_OE = "operational.entity"; //$NON-NLS-1$
  String TOOL_OEB_CREATE_OA = "operational.actor"; //$NON-NLS-1$
  String TOOL_OEB_CREATE_COMMUNICATION_MEAN = Messages.IToolNameConstants_820;
  String TOOL_OEB_INSERT_REMOVE_OPERATIONAL_ENTITIES = Messages.IToolNameConstants_821;
  String TOOL_OEB_INSERT_REMOVE_OPERATIONAL_ACTORS = Messages.IToolNameConstants_822;
  String TOOL_OEB_INSERT_REMOVE_COMMUNICATION_MEANS = "communication.means"; //$NON-NLS-1$
  String TOOL_OEB_CREATE_CONSTRAINT = Messages.IToolNameConstants_824;
  String TOOL_OEB_CREATE_CONSTRAINTELEMENT = Messages.IToolNameConstants_825;
  String TOOL_OEB_INSERT_REMOVE_CONSTRAINTS = Messages.IToolNameConstants_826;
  // Roles
  String TOOL_OEB_CREATE_ROLE = Messages.IToolNameConstants_827;
  String TOOL_OEB_MANAGE_ROLE_ALLOCATION = "manage.role.allocation"; //$NON-NLS-1$
  String TOOL_OEB_INSERT_REMOVE_ALL_ALLOCATED_ROLES = "all.allocated.roles"; //$NON-NLS-1$
  String TOOL_OEB_INSERT_REMOVE_ALLOCATED_ROLES = "allocated.roles"; //$NON-NLS-1$
  // Activities
  String TOOL_OEB_CREATE_OPERATIONAL_ACTIVITY = "operational.activity"; //$NON-NLS-1$
  String TOOL_OEB_CREATE_INTERACTION = Messages.IToolNameConstants_832;
  String TOOL_OEB_MANAGE_ACTIVITY_ALLOCATION = Messages.IToolNameConstants_833;
  String TOOL_OEB_INSERT_REMOVE_INTERACTIONS = Messages.IToolNameConstants_834;
  String TOOL_OEB_INSERT_REMOVE_OPERATIONAL_PROCESSES = "operational.processes"; //$NON-NLS-1$
  String TOOL_OEB_INSERT_REMOVE_ALLOCATED_ACTIVITIES = Messages.IToolNameConstants_836;
  String TOOL_OEB_INSERT_REMOVE_ALL_ALLOCATED_ACTIVITIES_IN_ENTITIES = "all.allocated.activities.in.entities"; //$NON-NLS-1$
  String TOOL_OEB_INSERT_REMOVE_ALL_ALLOCATED_ACTIVITIES_IN_ROLES = "all.allocated.activities.in.roles"; //$NON-NLS-1$
  String TOOL_OEB_INSERT_SCENARIO_ELEMENTS = TOOL_LAB_INSERT_SCENARIO_ELEMENTS;
  String TOOL_OEB_INSERT_STATEMODE_ELEMENTS = TOOL_LAB_INSERT_STATEMODE_ELEMENTS;

  String TOOL_OEB_SHOW_HIDE_OE = Messages.IToolNameConstants_839;
  String TOOL_OEB_SHOW_HIDE_OA = Messages.IToolNameConstants_840;
  String TOOL_OEB_SHOW_HIDE_COMMUNICATION_MEAN = Messages.IToolNameConstants_841;
  String TOOL_OEB_SHOW_HIDE_ALLOCATED_ACTIVITIES = Messages.IToolNameConstants_842;
  String TOOL_OEB_CREATE_OPERATIONAL_PROCESS = Messages.IToolNameConstants_843;
  String TOOL_OEB_SHOW_HIDE_OP = Messages.IToolNameConstants_844;
  String TOOL_OEB_SHOW_HIDE_ALLOCATED_ROLES = Messages.IToolNameConstants_845;
  String TOOL_OEB_SHOW_HIDE_ALL_ALLOCATED_ROLES = Messages.IToolNameConstants_846;
  String TOOL_OEB_ALL_ALLOCATED_ACTIVITIES_IN_ROLES = Messages.IToolNameConstants_847;
  String TOOL_OEB_ALL_ALLOCATED_ACTIVITIES_IN_ENTITIES = "all.allocated.activities.in.entities"; //$NON-NLS-1$
  String TOOL_OEB_SHOW_HIDE_INTERACTION = Messages.IToolNameConstants_849;

  String TOOL_OEB_INSERT_ACTIVITIES_FROM_MODE_STATE = Messages.IToolNameConstants_850;
  String TOOL_OEB_INSERT_ELEMENTS_FROM_SCENARIO = Messages.IToolNameConstants_851;
  String TOOL_OEB_STATE_MODE_ELEMENTS_ID = Messages.IToolNameConstants_852;
  String TOOL_OEB_SCENARIO_ELEMENTS_ID = Messages.IToolNameConstants_853;
  String TOOL_OEB_INSERT_REMOVE_CATEGORIES = Messages.IToolNameConstants_854;
  String TOOL_OEB_INSERT_REMOVE_COMMUNICATION_MEANS_CATEGORIES = Messages.IToolNameConstants_855;

  // OEBD tools - Operational Entity Breakdown
  String TOOL_OEBD_CREATE_OE = "operational.entity"; //$NON-NLS-1$
  String TOOL_OEBD_CREATE_OA = "operational.actor"; //$NON-NLS-1$
  String TOOL_OEBD_CONTAINED_IN = "contained.in"; //$NON-NLS-1$
  String TOOL_OEBD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_OEBD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_OEBD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // OES tools - Operational Entity Scenario
  String TOOL_OES_CREATE_OE = TOOL_CREATE_COMPONENT;
  String TOOL_OES_CREATE_OA = TOOL_CREATE_ACTOR;
  String TOOL_OES_CREATE_ROLE = "role"; //$NON-NLS-1$
  String TOOL_OES_INSERT_REMOVE_OPERATIONAL_ENTITIES_ROLES = TOOL_INSERT_REMOVE_ACTORS;
  String TOOL_OES_CREATE_INTERACTION_WITH_RETURN_BRANCH = "interaction.with.return.branch"; //$NON-NLS-1$
  String TOOL_OES_CREATE_INTERACTION = "interaction"; //$NON-NLS-1$
  String TOOL_OES_CREATE_MESSAGE = TOOL_CREATE_MESSAGE;
  String TOOL_OES_DELETE_MESSAGE = TOOL_DELETE_MESSAGE;
  String TOOL_OES_CREATE_REFERENCE = TOOL_CREATE_REFERENCE;
  String TOOL_OES_CREATE_LOOP = TOOL_CREATE_LOOP;
  String TOOL_OES_CREATE_ALT = TOOL_CREATE_ALT;
  String TOOL_OES_CREATE_PAR = TOOL_CREATE_PAR;
  String TOOL_OES_CREATE_OTHER_COMBINED_FRAGMENT = TOOL_CREATE_OTHER_COMBINED_FRAGMENT;
  String TOOL_OES_CREATE_OPERAND = TOOL_CREATE_OPERAND;
  String TOOL_OES_INSERT_REMOVE_ACTIVITY = "activity"; //$NON-NLS-1$
  String TOOL_OES_INSERT_REMOVE_STATE_MODE = TOOL_INSERT_REMOVE_STATE_MODE;
  String TOOL_OES_CREATE_COMMUNICATIONMEAN_RETURN_BRANCH = "communication.mean.return.branch"; //$NON-NLS-1$
  String TOOL_OES_CREATE_COMMUNICATION_MEAN = "communication.mean"; //$NON-NLS-1$
  String TOOL_OES_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_OES_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_OES_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_OES_CREATE_ARM_TIMER = TOOL_CREATE_ARM_TIMER;
  String TOOL_OES_CREATE_CANCEL_TIMER = TOOL_CREATE_CANCEL_TIMER;
  String TOOL_OES_DURATION = TOOL_DURATION;
  String TOOL_OES_EXCHANGE_CONTEXT = TOOL_EXCHANGE_CONTEXT;

  // OES tool ids (different from the label)
  String TOOL_OES_CREATE_SEQUENCE_MESSAGE = "sequence.message"; //$NON-NLS-1$
  String TOOL_OES_CREATE_SEQUENCE_MESSAGE_WITH_RETURN_BRANCH = "sequence.message.with.return.branch"; //$NON-NLS-1$
  String TOOL_OES_CREATE_CONSTRAINTELEMENTSCENARIO = "constraint.element.scenario"; //$NON-NLS-1$
  String TOOL_OES_CREATE_ACTIVITY_STATE = Messages.IToolNameConstants_874;

  // OPD tools - Operational Process Description
  String TOOL_OPD_INSERT_REMOVE_INVOLVE_OPERATIONAL_ACTIVITY = Messages.IToolNameConstants_875;
  String TOOL_OPD_INSERT_REMOVE_INVOLVE_INTERACTION = Messages.IToolNameConstants_876;
  String TOOL_OPD_INSERT_REMOVE_INVOLVE_OPERATIONAL_PROCESS = Messages.IToolNameConstants_877;
  String TOOL_OPD_INSERT_REMOVE_INVOLVE_INTERACTION_AND_TARGET_ACTIVITY = Messages.IToolNameConstants_878;
  String TOOL_OPD_INSERT_REMOVE_INVOLVE_INTERACTION_AND_TARGET_OPERATIONAL_PROCESS = Messages.IToolNameConstants_879;
  String TOOL_OPD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_OPD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_OPD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // ORB tools - Operational Role Blank diagram
  // Roles
  String TOOL_ORB_CREATE_OPERATIONAL_ROLE = "operational.role"; //$NON-NLS-1$
  String TOOL_ORB_INSERT_REMOVE_OPERATIONAL_ROLES = "operational.roles"; //$NON-NLS-1$
  String TOOL_ORB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_ORB_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_ORB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // Activities
  String TOOL_ORB_CREATE_OPERATIONAL_ACTIVITY = "operational.activity"; //$NON-NLS-1$
  String TOOL_ORB_CREATE_INTERACTION = "interaction"; //$NON-NLS-1$
  String TOOL_ORB_INSERT_REMOVE_INTERACTIONS = "interactions"; //$NON-NLS-1$
  String TOOL_ORB_MANAGE_ACTIVITY_ALLOCATION = "manage.activity.allocation"; //$NON-NLS-1$
  String TOOL_ORB_INSERT_REMOVE_ALLOCATED_ACTIVITIES = "allocated.activities"; //$NON-NLS-1$
  String TOOL_ORB_INSERT_REMOVE_ALL_ALLOCATED_ACTIVITIES = "all.allocated.activities"; //$NON-NLS-1$

  // Tool ID
  String TOOL_ORB_INSERT_OPERATIONAL_ROLE = Messages.IToolNameConstants_894;
  String TOOL_ORB_SHOW_HIDE_ALLOCATED_ACTIVITIES = Messages.IToolNameConstants_895;
  String TOOL_ORB_INSERT_ALL_ALLOCATED_ACTIVITIES = "all.allocated.activities"; //$NON-NLS-1$
  String TOOL_ORB_SHOW_HIDE_INTERACTION = Messages.IToolNameConstants_897;

  // PAB tools - Physical Architecture Blank
  // Node
  String TOOL_PAB_CREATE_NODE_PHYSICAL_COMPONENT = "node.pc"; //$NON-NLS-1$
  String TOOL_PAB_DEPLOY_NODE_PC = "deploy.node.pc"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_PHYSICAL_ACTOR = "physical.actor"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_PHYSICAL_LINK = "physical.link"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_PHYSICAL_PORT = "physical.port"; //$NON-NLS-1$
  String TOOL_PAB_MANAGE_NODE_COMP_DEPLOYMENT = "manage.node.pcs.deployment"; //$NON-NLS-1$
  @Deprecated
  String TOOL_PAB_INSERT_REMOVE_NODE_PCS = "node.pcs.monopart"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_DEPLOYED_NODE_PCS = "deployed.node.pcs"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_DEPLOYED_BEHAVIOUR_PCS = "deployed.behaviour.pcs"; //$NON-NLS-1$

  String TOOL_PAB_INSERT_REMOVE_PHYSICAL_LINKS = "physical.links"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_COMPONENT_PORT_ALLOCATION = "component.port.allocation"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_PHYSICAL_PATH = "physical.path"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_PHYSICAL_LINKS_CATEGORIES = "switch.physical.links.categories"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // Behavior
  String TOOL_PAB_DEPLOY_BEHAVIOR_PC = "deploy.behavior.pc"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_BEHAVIOR_PHYSICAL_COMPONENT = "behavior.pc"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_COMPONENT_EXCHANGE = TOOL_CREATE_COMPONENT_EXCHANGE;
  String TOOL_PAB_CREATE_COMPONENT_EXCHANGE_WITH_DELEGATIONS = "component.exchange.with.delegations"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_DELEGATION = "delegation"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_INFLOW_PORT = "in.flow.port"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_OUTFLOW_PORT = "out.flow.port"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_INOUTFLOW_PORT = "in.out.flow.port"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_STANDARD_PORT = "standard.port"; //$NON-NLS-1$
  String TOOL_PAB_MANAGE_BEHAVIOR_COMP_DEPLOYMENT = "manage.behavior.pcs.deployment"; //$NON-NLS-1$
  @Deprecated
  String TOOL_PAB_INSERT_REMOVE_BEHAVIOR_PCS = "behavior.pcs"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_ALL_DEPLOYED_NODE_PCS = "all.deployed.node.pcs"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_ALL_DEPLOYED_BEHAVIOUR_PCS = "all.deployed.behaviour.pcs"; //$NON-NLS-1$

  String TOOL_PAB_INSERT_REMOVE_COMPONENT_EXCHANGES = "component.exchanges"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_COMPONENT_EXCHANGES_CATEGORIES = "switch.component.exchanges.categories"; //$NON-NLS-1$
  // Functions
  String TOOL_PAB_CREATE_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_SELECT = "select"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_FUNCTION_INPUT_PORT = "input.port"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_FUNCTION_OUTPUT_PORT = "output.port"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_PORT_ALLOCATION = "port.allocation"; //$NON-NLS-1$
  String TOOL_PAB_MANAGE_FUNCTION_ALLOCATION = "manage.function.allocation"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_ALLOCATED_FUNCTIONS = "allocated.functions"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_ALL_ALLOCATED_FUNCTIONS = "all.allocated.functions"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_FUNCTIONAL_CHAINS = "functional.chains"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_FUNCTIONAL_EXCHANGES = "functional.exchanges"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_EXCHANGE_CATEGORIES = "switch.functional.exchanges.categories"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_SCENARIO_ELEMENTS = TOOL_LAB_INSERT_SCENARIO_ELEMENTS;
  String TOOL_PAB_INSERT_STATEMODE_ELEMENTS = TOOL_LAB_INSERT_STATEMODE_ELEMENTS;
  String TOOL_PAB_INSERT_REMOVE_COMPONENT_PORT_ALLOCATION = "component.port.allocations"; //$NON-NLS-1$

  // Unsynchronized tools
  String TOOL_PAB_INSERT_REMOVE_PORTS = "behaviour.ports"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_FUNCTION_PORTS = "function.ports"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_CATEGORIES = "node.categories"; //$NON-NLS-1$
  // multi parts tools
  String TOOL_PAB_REUSE_PC = "reuse.behaviour.pc"; //$NON-NLS-1$
  String TOOL_PAB_REUSE_NODE_PC = "reuse.node.pc"; //$NON-NLS-1$
  String TOOL_PAB_REUSE_BEHAVIOR_PC = "reuse.behaviour.pc"; //$NON-NLS-1$
  String TOOL_PAB_REUSE_PHYSICAL_ACTOR = "reuse.physical.actor"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_COMPONENT_EXCHANGE_WITH_PORTS = "component.exchange.with.ports"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_COMPONENT_EXCHANGE_WITHOUT_PORTS = "component.exchange.without.ports"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_COMPONENT_EXCHANGE_BETWEEN_TYPES = "component.exchange.between.types"; //$NON-NLS-1$

  // Others - tools id
  String TOOL_PAB_SHOW_HIDE_DEPLOYED_COMPONENT = Messages.IToolNameConstants_954;
  String TOOL_PAB_SHOW_HIDE_COMPONENT_EXCHANGES = Messages.IToolNameConstants_955;
  String TOOL_PAB_SHOW_HIDE_PHYSICAL_LINKS = Messages.IToolNameConstants_956;
  String TOOL_PAB_SHOW_HIDE_PORTS = Messages.IToolNameConstants_957;
  String TOOL_PAB_SHOW_HIDE_FUNCTION_PORTS = Messages.IToolNameConstants_958;
  String TOOL_PAB_CREATE_FUNCTIONAL_CHAIN = "functional.chain"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_PHYSICAL_PATH = "physical.path"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_PHYSICAL_ACTOR = Messages.IToolNameConstants_961;
  String TOOL_PAB_SHOW_HIDE_CONSTRAINT = Messages.IToolNameConstants_962;
  String TOOL_PAB_SHOW_HIDE_FUNCTIONAL_CHAINS = Messages.IToolNameConstants_963;
  String TOOL_PAB_SHOW_HIDE_FUNCTIONAL_EXCHANGES = "functional.exchanges"; //$NON-NLS-1$
  String TOOL_PAB_RECONNECT_PHYSICALLINK_TARGET = Messages.IToolNameConstants_965;
  String TOOL_PAB_RECONNECT_PHYSICALLINK_SOURCE = Messages.IToolNameConstants_966;
  String TOOL_PAB_RECONNECT_COMPONENTEXCHANGE_TARGET = Messages.IToolNameConstants_967;
  String TOOL_PAB_RECONNECT_COMPONENTEXCHANGE_SOURCE = Messages.IToolNameConstants_968;
  String TOOL_PAB_RECONNECT_FUNCTION_EXCHANGE = Messages.IToolNameConstants_969;
  String TOOL_PAB_CREATE_INPUT_PORT = "input.port"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_OUTPUT_PORT = "output.port"; //$NON-NLS-1$
  String TOOL_PAB_CREATE_INOUT_FLOW_PORT_PORT = "in.out.flow.port"; //$NON-NLS-1$
  String TOOL_PAB_SHOW_HIDE_EXCHANGE_CATEGORIES = Messages.IToolNameConstants_973;
  String TOOL_PAB_SWITCH_COMPONENT_CATEGORIES = Messages.IToolNameConstants_974;
  String TOOL_PAB_SWITCH_PHYSICAL_CATEGORIES = Messages.IToolNameConstants_975;

  String TOOL_PAB_INSERT_FUNCTIONS_FROM_MODE_STATE = Messages.IToolNameConstants_976;
  String TOOL_PAB_INSERT_ELEMENTS_FROM_SCENARIO = Messages.IToolNameConstants_977;
  String TOOL_PAB_STATE_MODE_ELEMENTS_ID = Messages.IToolNameConstants_978;
  String TOOL_PAB_SCENARIO_ELEMENTS_ID = Messages.IToolNameConstants_979;
  // Accelerators
  String TOOL_PAB_INITIALIZATION_FROM_EXISTING_DIAGRAM = "initialization.from.existing.diagram"; //$NON-NLS-1$

  // PCBD tools - Physical Component Breakdown
  String TOOL_PCBD_CREATE_NODE_PC = "node.pc"; //$NON-NLS-1$
  String TOOL_PCBD_CREATE_BEHAVIOR_PC = "behavior.pc"; //$NON-NLS-1$
  String TOOL_PCBD_CREATE_PHYSICAL_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_PCBD_CONTAINED_IN = "contained.in"; //$NON-NLS-1$
  String TOOL_PCBD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_PCBD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_PCBD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // Multi parts tools
  String TOOL_PCBD_CREATE_PART = "create.part"; //$NON-NLS-1$

  // PD tools - Package Dependencies
  String TOOL_PD_INSERT_REMOVE_DATA_PACKAGES = "data.packages"; //$NON-NLS-1$
  String TOOL_PD_INSERT_REMOVE_INTERFACE_PACKAGES = "interface.packages"; //$NON-NLS-1$
  String TOOL_PD_INSERT_REMOVE_DEPENDENCIES = "dependencies"; //$NON-NLS-1$
  String TOOL_PD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_PD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_PD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // tools ids
  String TOOL_PD_SHOW_HIDE_DATAPKGS = Messages.IToolNameConstants_995;
  String TOOL_PD_SHOW_HIDE_INTERFACEPKGS = Messages.IToolNameConstants_996;
  String TOOL_PD_SHOW_HIDE_DEPENDENT_PACKAGES = Messages.IToolNameConstants_997;

  // PDFB tools - Physical Data Flow Blank tools
  String TOOL_PDFB_CREATE_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_PDFB_CREATE_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_PDFB_CREATE_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_PDFB_CREATE_SELECT = "select"; //$NON-NLS-1$
  String TOOL_PDFB_CREATE_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_PDFB_CREATE_INPUT_PORT = "input.port"; //$NON-NLS-1$
  String TOOL_PDFB_CREATE_OUTPUT_PORT = "output.port"; //$NON-NLS-1$
  String TOOL_PDFB_INSERT_FUNCTIONS = "functions"; //$NON-NLS-1$
  String TOOL_PDFB_INSERT_REMOVE_FUNCTIONAL_EXCHANGES = "functional.exchanges"; //$NON-NLS-1$
  String TOOL_PDFB_INSERT_REMOVE_FUNCTION_PORTS = "function.ports"; //$NON-NLS-1$
  String TOOL_PDFB_INSERT_REMOVE_EXCHANGE_CATEGORIES = "exchange.categories"; //$NON-NLS-1$
  String TOOL_PDFB_INSERT_REMOVE_FUNCTIONAL_CHAINS = "functional.chains"; //$NON-NLS-1$
  String TOOL_PDFB_CREATE_FUNCTIONAL_CHAIN_ELEMENTS = "functional.chain.elements"; //$NON-NLS-1$
  String TOOL_PDFB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_PDFB_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_PDFB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  String TOOL_PDFB_INSERT_SCENARIO_ELEMENTS = TOOL_LDFB_INSERT_SCENARIO_ELEMENTS;
  String TOOL_PDFB_INSERT_STATEMODE_ELEMENTS = TOOL_LDFB_INSERT_STATEMODE_ELEMENTS;

  String TOOL_PDFB_CREATE_FUNCTIONAL_CHAIN = "functional.chain"; //$NON-NLS-1$
  String TOOL_PDFB_SHOW_HIDE_FUNCTIONAL_CHAIN = Messages.IToolNameConstants_1015;
  String TOOL_PDFB_SHOW_HIDE_FUNCTIONAL_EXCH_CATEGORIES = "switch.functional.exchanges.categories"; //$NON-NLS-1$
  String TOOL_PDFB_SHOW_HIDE_EXCH_CATEGORIES = Messages.IToolNameConstants_1017;
  String TOOL_PDFB_SHOW_HIDE_FUNCTIONS = Messages.IToolNameConstants_1018;
  String TOOL_PDFB_SHOW_HIDE_FUNCTIONAL_EXCHANGES = Messages.IToolNameConstants_1019;
  String TOOL_PDFB_SHOW_HIDE_FUNCTION_PORTS = Messages.IToolNameConstants_1020;

  String TOOL_PDFB_INSERT_FUNCTIONS_FROM_MODE_STATE = Messages.IToolNameConstants_1021;
  String TOOL_PDFB_INSERT_ELEMENTS_FROM_SCENARIO = Messages.IToolNameConstants_1022;
  String TOOL_PDFB_STATE_MODE_ELEMENTS_ID = Messages.IToolNameConstants_1023;
  String TOOL_PDFB_SCENARIO_ELEMENTS_ID = Messages.IToolNameConstants_1024;
  // Accelerators
  String TOOL_PDFB_INITIALIZATION_FROM_EXISTING_DIAGRAM = "initialization.from.existing.diagram"; //$NON-NLS-1$

  // PFBD tools - Physical Function Breakdown
  String TOOL_PFBD_CREATE_PHYSICAL_FUNCTION = "physical.function"; //$NON-NLS-1$
  String TOOL_PFBD_CREATE_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_PFBD_CREATE_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_PFBD_CREATE_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_PFBD_CREATE_SELECT = "select"; //$NON-NLS-1$
  String TOOL_PFBD_CREATE_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_PFBD_CONTAINED_IN = "contained.in"; //$NON-NLS-1$
  String TOOL_PFBD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_PFBD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_PFBD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // tool id
  String TOOL_PDFB_RECONNECT_EXCHANGE = Messages.IToolNameConstants_1036;

  // PPD tools - Physical Path Description
  String TOOL_PPD_INSERT_REMOVE_INVOLVE_COMPONENT = "involve.component"; //$NON-NLS-1$
  String TOOL_PPD_INSERT_REMOVE_INVOLVE_PHYSICAL_PATH = "involve.physical.path"; //$NON-NLS-1$
  String TOOL_PPD_INSERT_REMOVE_INVOLVE_PHYSICAL_LINK = "involve.physical.link"; //$NON-NLS-1$
  String TOOL_PPD_INSERT_REMOVE_INVOLVE_PHYSICAL_LINK_AND_TARGET_COMPONENT = "involve.physical.link.and.target.component"; //$NON-NLS-1$
  String TOOL_PPD_INSERT_REMOVE_INVOLVE_PHYSICAL_LINK_AND_TARGET_PHYSICAL_PATH = "involve.physical.link.and.target.physical.path"; //$NON-NLS-1$
  String TOOL_PPD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_PPD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_PPD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // multi parts tools
  String TOOL_PPD_INSERT_REMOVE_INVOLVE_PART = "involve.part"; //$NON-NLS-1$
  String TOOL_PPD_INSERT_REMOVE_INVOLVE_PHYSICAL_LINK_AND_TARGET_PART = "involve.physical.link.and.target.part"; //$NON-NLS-1$

  // SAB Tools - System Architecture Blank
  // Components
  String TOOL_SAB_CREATE_ACTOR = "actor"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_IN_FLOW_PORT = "in.flow.port"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_OUT_FLOW_PORT = "out.flow.port"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_INOUT_FLOW_PORT = "in.out.flow.port"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_STANDARD_PORT = "standard.port"; //$NON-NLS-1$

  // WARNING: label and id tool are different and are used in different tests
  String TOOL_SAB_CREATE_COMPONENT_EXCHANGE_LABEL = TOOL_CREATE_COMPONENT_EXCHANGE;
  String TOOL_SAB_CREATE_PHYSICAL_LINK = "physical.link"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_PHYSICAL_PORT = "physical.port"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_ACTORS = "actors"; //$NON-NLS-1$
  @Deprecated
  String TOOL_SAB_INSERT_REMOVE_COMPONENT_EXCHANGES = "component.exchanges"; //$NON-NLS-1$
  @Deprecated
  String TOOL_SAB_INSERT_REMOVE_PHYSICAL_LINKS = "physical.links"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_PHYSICAL_PATH = "physical.path"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_PHYSICAL_LINKS_CATEGORIES = "switch.physical.links.categories"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$
  // Functions
  String TOOL_SAB_CREATE_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_SELECT = "select"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_FUNCTION_INPUT_PORT = "input.port"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_FUNCTION_OUTPUT_PORT = "output.port"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_PORT_ALLOCATION = "port.allocation"; //$NON-NLS-1$
  String TOOL_SAB_MANAGE_FUNCTION_ALLOCATION = "manage.function.allocation"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_ALLOCATED_FUNCTIONS = "allocated.functions"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_ALL_ALLOCATED_FUNCTIONS = "all.allocated.functions"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_FUNCTIONAL_CHAINS = "functional.chains"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_FUNCTIONAL_EXCHANGES = "functional.exchanges"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_EXCHANGE_CATEGORIES = "switch.functional.exchanges.categories"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_SCENARIO_ELEMENTS = TOOL_LAB_INSERT_SCENARIO_ELEMENTS;
  String TOOL_SAB_INSERT_STATEMODE_ELEMENTS = TOOL_LAB_INSERT_STATEMODE_ELEMENTS;

  String TOOL_SAB_INSERT_FUNCTIONS_FROM_MODE_STATE = "functions.from.mode.state"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_ELEMENTS_FROM_SCENARIO = "elements.from.scenario"; //$NON-NLS-1$
  String TOOL_SAB_STATE_MODE_ELEMENTS_ID = Messages.IToolNameConstants_1078;
  String TOOL_SAB_SCENARIO_ELEMENTS_ID = Messages.IToolNameConstants_1079;
  String TOOL_SAB_INSERT_REMOVE_CATEGORIES = "categories"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_COMPONENT_EXCHANGES_CATEGORIES = "switch.component.exchanges.categories"; //$NON-NLS-1$
  // Accelerators
  String TOOL_SAB_INITIALIZATION_FROM_EXISTING_DIAGRAM = "initialization.from.existing.diagram"; //$NON-NLS-1$
  // Unsynchronized tools
  String TOOL_SAB_INSERT_REMOVE_FUNCTION_PORTS = "function.ports"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_REMOVE_PORTS = "component.ports"; //$NON-NLS-1$
  // Multi parts tools
  String TOOL_SAB_REUSE_ACTOR = "reuse.actor"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_COMPONENT_EXCHANGE_WITH_PORTS = "component.exchange.with.ports"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_COMPONENT_EXCHANGE_WITHOU_PORTS = "component.exchange.without.ports"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_COMPONENT_EXCHANGE_BETWEEN_TYPES = "component.exchange.between.types"; //$NON-NLS-1$

  // tools id
  String TOOL_SAB_CREATE_INFLOW_PORT = "in.flow.port"; //$NON-NLS-1$
  String TOOL_SAB_CREATE_OUTFLOW_PORT = "out.flow.port"; //$NON-NLS-1$
  String TOOL_SAB_INSERT_ACTOR = Messages.IToolNameConstants_1091;
  String TOOL_SAB_CREATE_COMPONENT_EXCHANGE = "component.exchange.with.ports"; //$NON-NLS-1$

  String TOOL_SAB_SHOW_HIDE_COMPONENT_EXCHANGE = "component.exchanges"; //$NON-NLS-1$
  String TOOL_LAB_SHOW_HIDE_COMPONENT_EXCHANGE = "component.exchanges.delegations"; //$NON-NLS-1$
  String TOOL_PAB_SHOW_HIDE_COMPONENT_EXCHANGE = "component.exchanges.delegations"; //$NON-NLS-1$
  String TOOL_OAB_SHOW_HIDE_COMMUNICATION_MEAN = "communication.means"; //$NON-NLS-1$

  String TOOL_SAB_SHOW_HIDE_PHYSICAL_LINK = Messages.IToolNameConstants_1097;
  String TOOL_LAB_SHOW_HIDE_PHYSICAL_LINK = Messages.IToolNameConstants_1098;
  String TOOL_PAB_SHOW_HIDE_PHYSICAL_LINK = Messages.IToolNameConstants_1099;

  String TOOL_SAB_SHOW_HIDE_PORTS = Messages.IToolNameConstants_1100;
  String TOOL_SAB_SHOW_HIDE_CONSTRAINTS = Messages.IToolNameConstants_1101;
  String TOOL_SAB_CREATE_FUNCTIONAL_CHAIN = "functional.chain"; //$NON-NLS-1$
  String TOOL_SAB_SHOW_HIDE_FUNCTIONAL_CHAINS = Messages.IToolNameConstants_1103;
  String TOOL_SAB_SHOW_HIDE_FUNCTIONAL_EXCHANGES = "functional.exchanges"; //$NON-NLS-1$
  String TOOL_SAB_SHOW_HIDE_FUNCTION_PORTS = Messages.IToolNameConstants_1105;
  String TOOL_SAB_RECONNECT_EXCHANGES_TARGET = Messages.IToolNameConstants_1106;
  String TOOL_SAB_RECONNECT_EXCHANGES_SOURCE = Messages.IToolNameConstants_1107;
  String TOOL_SAB_RECONNECT_FUNCTION_EXCHANGES = Messages.IToolNameConstants_1108;

  String TOOL_SAB_RECONNECT_PHYSICALLINK_SOURCE_ID = Messages.IToolNameConstants_1109;
  String TOOL_SAB_RECONNECT_PHYSICALLINK_TARGET_ID = Messages.IToolNameConstants_1110;
  String TOOL_LAB_RECONNECT_PHYSICALLINK_TARGET_ID = Messages.IToolNameConstants_1111;
  String TOOL_LAB_RECONNECT_PHYSICALLINK_SOURCE_ID = Messages.IToolNameConstants_1112;

  // SDFB tools - System Data Flow Blank tools
  String TOOL_SDFB_CREATE_OUTPUT_PORT = "output.port"; //$NON-NLS-1$
  String TOOL_SDFB_CREATE_INPUT_PORT = "input.port"; //$NON-NLS-1$
  String TOOL_SDFB_CREATE_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_SDFB_CREATE_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_SDFB_CREATE_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_SDFB_CREATE_SELECT = "select"; //$NON-NLS-1$
  String TOOL_SDFB_CREATE_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_SDFB_CREATE_FUNCTIONAL_CHAIN = "functional.chain"; //$NON-NLS-1$
  String TOOL_SDFB_RECONNECT_EXCHANGE = Messages.IToolNameConstants_1121;
  String TOOL_SDFB_SHOW_HIDE_EXCH_CATEGORIES = Messages.IToolNameConstants_1122;
  String TOOL_SDFB_SHOW_HIDE_FUNCTIONS = "functions"; //$NON-NLS-1$
  String TOOL_SDFB_SHOW_HIDE_FUNCTIONAL_CHAIN = Messages.IToolNameConstants_1124;
  String TOOL_SDFB_SHOW_HIDE_FUNCTIONAL_EXCH_CATEGORIES = Messages.IToolNameConstants_1125;
  String TOOL_SDFB_SHOW_HIDE_FUNCTIONAL_EXCHANGES = Messages.IToolNameConstants_1126;
  String TOOL_SDFB_SHOW_HIDE_FUNCTION_PORTS = Messages.IToolNameConstants_1127;
  String TOOL_SDFB_INSERT_SCENARIO_ELEMENTS = TOOL_LDFB_INSERT_SCENARIO_ELEMENTS;
  String TOOL_SDFB_INSERT_STATEMODE_ELEMENTS = TOOL_LDFB_INSERT_STATEMODE_ELEMENTS;
  String TOOL_SDFB_DND_SYSTEM_FUNCTION = Messages.IToolNameConstants_1128;
  String TOOL_SDFB_RECONNECT_EXCHANGES = Messages.IToolNameConstants_1129;

  // SDFB tool constants added
  String TOOL_SDFB_INSERT_REMOVE_FUNCTIONS = "functions"; //$NON-NLS-1$
  String TOOL_SDFB_INSERT_REMOVE_FUNCTIONAL_EXCHANGES = "functional.exchanges"; //$NON-NLS-1$
  String TOOL_SDFB_INSERT_REMOVE_FUNCTIONAL_CHAINS = "functional.chains"; //$NON-NLS-1$
  String TOOL_SDFB_CREATE_FUNCTIONAL_CHAIN_ELEMENTS = "functional.chain.elements"; //$NON-NLS-1$
  String TOOL_SDFB_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_SDFB_CREATE_CONSTRAINT_ELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_SDFB_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  String TOOL_SDFB_INSERT_FUNCTIONS_FROM_MODE_STATE = "functions.from.mode.state"; //$NON-NLS-1$
  String TOOL_SDFB_INSERT_ELEMENTS_FROM_SCENARIO = "elements.from.scenario"; //$NON-NLS-1$
  String TOOL_SDFB_STATE_MODE_ELEMENTS_ID = Messages.IToolNameConstants_1139;
  String TOOL_SDFB_SCENARIO_ELEMENTS_ID = Messages.IToolNameConstants_1140;
  // Accelerators
  String TOOL_SDFB_INITIALIZATION_FROM_EXISTING_DIAGRAM = "initialization.from.existing.diagram"; //$NON-NLS-1$
  // Unsynchronized tools
  String TOOL_SDFB_INSERT_REMOVE_FUNCTION_PORTS = "function.ports"; //$NON-NLS-1$
  String TOOL_SDFB_INSERT_REMOVE_EXCHANGE_CATEGORIES = "exchange.categories"; //$NON-NLS-1$
  String TOOL_SDFB_EXCHANGE_CONTEXT = Messages.IToolNameConstants_1144;

  // SFBD tools - System Function Breakdown
  String TOOL_SFBD_CREATE_SYSTEM_FUNCTION = "system.function"; //$NON-NLS-1$
  String TOOL_SFBD_CREATE_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_SFBD_CREATE_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_SFBD_CREATE_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_SFBD_CREATE_SELECT = "select"; //$NON-NLS-1$
  String TOOL_SFBD_CREATE_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_SFBD_CONTAINED_IN = "contained.in"; //$NON-NLS-1$
  String TOOL_SFBD_CREATE_CONSTRAINT = "constraint"; //$NON-NLS-1$
  String TOOL_SFBD_CREATE_CONSTRAINTELEMENT = "constraint.element"; //$NON-NLS-1$
  String TOOL_SFBD_INSERT_REMOVE_CONSTRAINTS = "constraints"; //$NON-NLS-1$

  // System (ex-CTX layer) Interface Diagram Blank (SIDB) tools
  String TOOL_SIDB_SHOW_HIDE_COMPONENTS = Messages.IToolNameConstants_1155;
  String TOOL_SIDB_CREATE_ACTOR = Messages.IToolNameConstants_1156;
  String TOOL_SIDB_CREATE_ECHANGE_ITEM_EVENT = Messages.IToolNameConstants_1157;
  String TOOL_SIDB_CREATE_ECHANGE_ITEM_OPERATION = Messages.IToolNameConstants_1158;
  String TOOL_SIDB_CREATE_ECHANGE_ITEM_FLOW = Messages.IToolNameConstants_1159;
  String TOOL_SIDB_CREATE_ECHANGE_ITEM_DATA = Messages.IToolNameConstants_1160;
  String TOOL_SIDB_CREATE_UNDEFINED_ECHANGE_ITEM = Messages.IToolNameConstants_1161;
  String TOOL_SIDB_CREATE_INTERFACE = Messages.IToolNameConstants_1162;
  String TOOL_SIDB_CREATE_COMMUNICATION_LINK_TRANSMIT = Messages.IToolNameConstants_1163;
  String TOOL_SIDB_CREATE_COMMUNICATION_LINK_ACQUIRE = Messages.IToolNameConstants_1164;
  String TOOL_SIDB_MANAGE_EXCHANGE_ITEM_ALLOCATIONS = Messages.IToolNameConstants_1165;
  String TOOL_SIDB_SHOW_HIDE_ACTORS = Messages.IToolNameConstants_1166;
  String TOOL_SIDB_SHOW_HIDE_EXCHANGE_ITEMS = Messages.IToolNameConstants_1167;
  String TOOL_SIDB_SHOW_HIDE_ITEM_ALLOCATIONS = Messages.IToolNameConstants_1168;
  String TOOL_SIDB_SHOW_HIDE_EXCHANGE_ITEM_ELEMENTS = Messages.IToolNameConstants_1169;
  String TOOL_SIDB_CREATE_EXCHANGE_ITEM_ELEMENT = Messages.IToolNameConstants_1170;

  // Common diagram tools id of LAB, PAB and SAB
  String TOOL_XAB_SHOW_HIDE_ALLOCATED_FUNCTIONS = "show.hide.allocated.functions"; //$NON-NLS-1$
  String TOOL_XAB_SHOW_ALL_ALLOCATED_FUNCTIONS = "show.all.allocated.functions"; //$NON-NLS-1$
  String TOOL_XAB_SHOW_HIDE_COMPONENTS = "show.hide.components"; //$NON-NLS-1$

  String TOOL_XAB_INSERT_REMOVE_COMPONENTS_MONOPART = "components.monopart"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_REMOVE_COMPONENTS_MULTIPART = "components.multipart"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_NODE_COMPONENTS_MONOPART = "node.pcs.monopart"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_NODE_COMPONENTS_MULTIPART = "node.pcs.multipart"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_BEHAVIOUR_COMPONENTS_MONOPART = "behavior.pcs.monopart"; //$NON-NLS-1$
  String TOOL_PAB_INSERT_REMOVE_BEHAVIOUR_COMPONENTS_MULTIPART = "behavior.pcs.multipart"; //$NON-NLS-1$
  //
  // Representation Descriptions moved to IDiagramNameConstants
  //

  // TABLE TOOLS - Currently there are only two operations available
  // 1. Create a cell value with "X" and delete the cell value -- which is an
  // empty string ""

  String INTERFACES_SCENARIOS_DIAGRAM_NAME = Messages.IToolNameConstants_1180;

  String TABLE_TOOL_CREATE_CELL_VALUE = "X"; //$NON-NLS-1$
  String TABLE_TOOL_DELETE_CELL_VALUE = ICommonConstants.EMPTY_STRING;

  /**
   * Tool on IS, ES diagrams to create multiple instance roles for identical represented
   */
  String TOOL_SCENARIO_MULTI_INSTANCEROLE_COMPONENT = "add.multiple.lifelines.for.an.existing.component"; //$NON-NLS-1$
  String TOOL_SCENARIO_MULTI_INSTANCEROLE_ACTOR = "add.multiple.lifelines.for.an.existing.actor"; //$NON-NLS-1$
  String TOOL_SCENARIO_SYSTEM_FUNCTION = "system.function"; //$NON-NLS-1$
  String TOOL_SCENARIO_LOGICAL_FUNCTION = "logical.function"; //$NON-NLS-1$
  String TOOL_SCENARIO_PHYSICAL_FUNCTION = "physical.function"; //$NON-NLS-1$
  String TOOL_OES_MULTI_INSTANCEROLE_ENTITYACTOR = "add.multiple.lifelines.for.an.existing.entity.actor"; //$NON-NLS-1$

  /*
   * XAB
   */
  String TOOL_XAB_CREATE_PHYSICAL_LINK = "physical.link"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_PHYSICAL_PORT = "physical.port"; //$NON-NLS-1$
  String TOOL_XAB_RECONNECT_PHYSICALLINK_SOURCE_ID = "Reconnect PhysicalLink Source"; //$NON-NLS-1$
  String TOOL_XAB_RECONNECT_PHYSICALLINK_TARGET_ID = "Reconnect PhysicalLink Target"; //$NON-NLS-1$
  String TOOL_XAB_SHOW_HIDE_PHYSICAL_LINK = "physical.links"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_DELEGATION = "delegation"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_COMPONENT_EXCHANGE_WITH_DELEGATIONS = "component.exchange.with.delegations"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_COMPONENT_EXCHANGE_WITH_PORTS = "component.exchange.with.ports"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_COMPONENT_EXCHANGE_WITHOUT_PORTS = "component.exchange.without.ports"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_COMPONENT_EXCHANGE_BETWEEN_TYPES = "component.exchange.between.types"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_FUNCTIONAL_EXCHANGE = "functional.exchange"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_INFLOW_PORT = "in.flow.port"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_OUTFLOW_PORT = "out.flow.port"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_INOUT_FLOW_PORT = "in.out.flow.port"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_STANDARD_PORT = "standard.port"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_ACTORS_MONOPART = "actors.monopart"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_ACTORS_MULTIPART = "actors.multipart"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_FUNCTION_INPUT_PORT = "input.port"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_FUNCTION_OUTPUT_PORT = "output.port"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_PORT_ALLOCATION = "port.allocation"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_REMOVE_PORT_ALLOCATION = "port.allocations"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_DUPLICATE = "duplicate"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_GATHER = "gather"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_ROUTE = "route"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_SELECT = "select"; //$NON-NLS-1$
  String TOOL_XAB_CREATE_SPLIT = "split"; //$NON-NLS-1$
  String TOOL_XAB_MANAGE_FUNCTION_ALLOCATION = "manage.function.allocation"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_REMOVE_EXCHANGE_CATEGORIES = "switch.functional.exchanges.categories"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_REMOVE_FUNCTIONAL_CHAINS = "functional.chains"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_REMOVE_FUNCTION_PORTS = "function.ports"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_REMOVE_CATEGORIES = "categories"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_ELEMENTS_FROM_SCENARIO = "elements.from.scenario"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_FUNCTIONS_FROM_MODE_STATE = "functions.from.mode.state"; //$NON-NLS-1$
  String TOOL_XAB_INSERT_REMOVE_PHYSICAL_PATH = "physical.paths"; //$NON-NLS-1$

  // Title Blocks tools
  String TOOL_CREATE_TITLE_BLOCK = "title.block"; //$NON-NLS-1$

  // insert/remove line/col TB
  String TOOL_INSERT_LINE_TITLE_BLOCK = "title.block.line"; //$NON-NLS-1$
  String TOOL_INSERT_COLUMN_TITLE_BLOCK = "title.block.column"; //$NON-NLS-1$
  String TOOL_REMOVE_LINE_TITLE_BLOCK = "remove.title.block.line"; //$NON-NLS-1$
  String TOOL_REMOVE_COLUMN_TITLE_BLOCK = "remove.title.block.column"; //$NON-NLS-1$

  // s/h TB
  String TOOL_INSERT_REMOVE_TITLE_BLOCK = "title.blocks"; //$NON-NLS-1$

  //delete TB tools
  String TOOL_DELETE_DIAGRAM_TITLE_BLOCK = Messages.IToolNameConstants_1228;
  
}