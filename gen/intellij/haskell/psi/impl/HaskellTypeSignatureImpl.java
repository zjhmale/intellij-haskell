// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static intellij.haskell.psi.HaskellTypes.*;
import intellij.haskell.psi.*;
import com.intellij.navigation.ItemPresentation;
import scala.Option;
import scala.collection.Seq;

public class HaskellTypeSignatureImpl extends HaskellCompositeElementImpl implements HaskellTypeSignature {

  public HaskellTypeSignatureImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitTypeSignature(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HaskellCcontext> getCcontextList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellCcontext.class);
  }

  @Override
  @NotNull
  public List<HaskellQNames> getQNamesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellQNames.class);
  }

  @Override
  @NotNull
  public HaskellTtype getTtype() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, HaskellTtype.class));
  }

  public String getName() {
    return HaskellPsiImplUtil.getName(this);
  }

  public ItemPresentation getPresentation() {
    return HaskellPsiImplUtil.getPresentation(this);
  }

  public Seq<HaskellNamedElement> getIdentifierElements() {
    return HaskellPsiImplUtil.getIdentifierElements(this);
  }

  public Option<String> getModuleName() {
    return HaskellPsiImplUtil.getModuleName(this);
  }

}
